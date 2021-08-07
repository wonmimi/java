package Algorithm.BOJ.Search;

import java.io.*;
import java.util.*;

/*
 백준 15650
 15920KB	148ms
 */
public class Code04 {
    static int N;
    static int M;
    static int[] selected;
    static int[] used;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        dataInput();
        selected = new int[M+1];
        used = new int[N+1];
        solution(1);
        System.out.println(result);

        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        int result = stack.pop();
        System.out.println(result);
    }

    static void solution(int num){
        if(num == M +1){
            for(int r =1; r<selected.length; r++){
                result.append(selected[r]+" ");
            }
//            result.append("\n");

        }else {
            for(int i =1; i <= N ; i++){
                // 중복 체크
                if(used[i] == 1) continue;
                // 오름 차순
                if((num > 1) && (selected[num -1] >= i)) continue;
                selected[num] = i;
                used[i] =1;
                solution(num + 1);
                selected[num] = 0;
                used[i] = 0;
            }

        }

    }

    static void dataInput()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            StringTokenizer tokeniZer = new StringTokenizer(line, " ");
            int[] inputData = new int[2];
            int i =0;
            while (tokeniZer.hasMoreTokens()){
                inputData[i] = Integer.parseInt(tokeniZer.nextToken());
                i++;
            }
            N = inputData[0];
            M = inputData[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}