package Algorithm.CategoryPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int SIZE = 9;
    static boolean[] visited = new boolean[SIZE];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = true;

        while (!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i=0; i<graph.get(node).size(); i++){
                int searching = graph.get(node).get(i);
                if(!visited[searching]){
                    queue.offer(searching);
                    visited[searching] = true;
                } else {
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int x=0; x<9; x++){
            graph.add(new ArrayList<>());
        }

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

        bfs(1);
    }
}
