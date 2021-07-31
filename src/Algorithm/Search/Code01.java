package Algorithm.Search;
/*
    완전 탐색
    N 중복 허용 , M 순서 있게
    백준 15651
 */

import java.io.*;
import java.util.StringTokenizer;

public class Code01 {
    static StringBuilder sb = new StringBuilder();

    static int N,M;
    static int[] selected;

     static void dataInput(){
         FastReader scan = new FastReader();
         N = scan.nextInt();
         M = scan.nextInt();
         selected = new int[M+1]; // selected[ 1 ~ M ]

     }

     static void solution(int n){
         System.out.println("solution "+n);
         if(n == (M+1)){ // m개 끝
             for(int i=1; i<=M; i++){
                 sb.append(selected[i]).append(' ');
             }
             sb.append('\n');
         } else {
             for (int cand = 1 ; cand <= N; cand ++){
                 System.out.println("cand "+cand);

                 selected[n] = cand;

                 solution(n+1); // 1 ~ M
                 selected[n] = 0;
                 System.out.println("n : 0 " + n);
             }
             System.out.println("for END "+n);
         }
         System.out.println("solution END "+n);
     }

    public static void main(String[] args) {
        // 입력
        dataInput();
        solution(1); // 원소 1부터
        // 출력
        System.out.println("\n"+sb.toString());
//        System.out.println(sb);

        // [0] 은 항상 0
//        System.out.println(selected.length);
//        for(int sel : selected){
//            System.out.println(sel+" ");
//        }

    }


     static class FastReader {
         BufferedReader br;
         StringTokenizer st;

         public FastReader() {
             br = new BufferedReader(new InputStreamReader(System.in));
         }

         public FastReader(String s) throws FileNotFoundException {
             br = new BufferedReader(new FileReader(new File(s)));
         }

         String next(){
             while (st == null || !st.hasMoreElements()){
                 try {
                     st = new StringTokenizer(br.readLine());
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             return st.nextToken();
         }

         int nextInt(){
             return Integer.parseInt(next());
         }

         long nextLong(){
             return Long.parseLong(next());
         }

         double nextDouble(){
             return Double.parseDouble(next());
         }

         String nextLine() {
             String str = "";
             try {
                 str = br.readLine();
             } catch (IOException e) {
                 e.printStackTrace();
             }
             return str;
         }
     }






}
