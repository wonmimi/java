package Algorithm.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
백준 15652
 */
public class Code03 {
    static int N,M;
     static int[] selected;
     static StringBuilder result = new StringBuilder(); //18108KB	220ms
//    static String result = ""; // 298612KB ,  856ms

    public static void main(String[] args) throws IOException {

        //입력
        initInput();
        //실행
        solution(1);
        //출력
        System.out.println(result);

    }



    static void solution(int num) {
        if(num == M + 1){ // 출력 result
            for(int j = 1 ; j<selected.length; j++){
//                result += (selected[j] + " ");
                result.append(selected[j]+" ");
            }
//            result += "\n";
        } else {
            int pre = selected[num -1 ]; // 이전 값
            if(pre == 0) pre = 1;
            for(int i= pre; i<=N; i++){ // num~N
                selected[num] = i;
                solution(num+1);
                selected[num] = 0;
            }
        }

    }

    static void initInput() throws IOException {
        //입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int[] inputData = new int[2];
        int i = 0;
        while(st.hasMoreTokens()){
            inputData[i] =  Integer.parseInt(st.nextToken());
            i++;
        }
        N = inputData[0];
        M = inputData[1];
        selected = new int[M+1];
    }
}
