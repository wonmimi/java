package Algorithm.CategoryPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class BFS_01 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int result =0;

    static void bfs(int x, int y){

        for (int i=0; i<x; i++){
//            System.out.println("x:"+x+" y:"+y);

            for(int j=(y-1); j<m; j++){
                int num = graph.get(i).get(j);
                if(num == 1){
//                    System.out.println(" c1 : i:"+i+" j:"+j);
                    result++;
                    if(x < n){ // 마지막행 전까지
                        if((i+1) >= n) break;
                        if(graph.get(i+1).get(j) == 1){ // bottom
                            x++; // 행 +1
                            y=(j+1); // 시작 열
//                            System.out.println(" c2 bottom : i:"+(i+1)+" j:"+j);
//                            System.out.println(" result : "+result);
                            break;
                        }
                    }
//                    System.out.println("-result : "+result);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
            String str = scanner.next();
            for (int j=0; j<m; j++){
                int num = str.charAt(j)-'0';
                graph.get(i).add(num);
            }
        }
        // 입력 E

        bfs(1,1);
        System.out.println(result);

        // test 1 : 5 6 101010 111111 000001 111111 111111 => 10 (공백 또는 줄바꿈으로)
        // test 2 : 3 4 1101 0100 1111 => 6
        // test 3 : 4 4 1001 1101 1111 1111 => 7


    }
}
