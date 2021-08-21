package Algorithm.CategoryPractice;

import java.util.ArrayList;

public class DFS {
    static int SIZE = 9;
    static boolean[] visted = new boolean[SIZE]; // 방문 처리
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(); // 중첩 list => graph

    public static void dfs(int n){
        visted[n] = true;
        System.out.print(n+" ");
        for(int i=0; i<graph.get(n).size(); i++){
            int value = graph.get(n).get(i);
            if(!visted[value]){
                dfs(value);
            } else {
                continue;
            }

        }

    }

    public static void main(String[] args) {

        for(int i=0; i<SIZE; i++){
            graph.add(new ArrayList<Integer>()); // 노드별 리스트 초기화
        }

        // 노드0은 빈값
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);


//        System.out.println(graph);

        dfs(1); // 1부터 탐색 (노드 작은번호순 일 경우)







    }
}
