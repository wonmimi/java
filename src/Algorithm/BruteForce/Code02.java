package Algorithm.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code02 {
    static int N,M;
    static int[] selected;
    static StringBuilder str = new StringBuilder();

    static void solution(int num){ // 1~
        // M 자리만큼 N개 숫자 돌리는데 중복 X
        if(num == (M+1)){
            for(int i=1; i<selected.length; i++){
                str.append(selected[i]).append(" ");
            }
            str.append('\n');
        }else {
            for(int t =1; t<=N; t++){
                boolean isDuplicate = false;
                for(int j=1; j < num; j++){
                    if(selected[j] == t) {
                        isDuplicate = true;
                    }
                }
                if(!isDuplicate){
                    selected[num] = t;
                    solution(num+1);
                    selected[num] = 0;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 입력
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

        //sol
        solution(1); // 1 ~
        // 출력
        System.out.println(str);
        //        System.out.println(str.toString());


//        System.out.println(selected[1]);
//        System.out.println(selected[2]);
    }


}
