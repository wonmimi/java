package Algorithm.CategoryPractice;

/*
     큐 이용 풀이
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int x;
    private int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class BFS_01_queue {

    public static int n,m;
    public static int[][] graph = new int[201][201];

    // 방향 - 상하좌우
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));

        // 큐가 빌때 까지
        while (!q.isEmpty()){
            Node node = q.poll(); // 원소 빼기
            x = node.getX();
            y = node.getY();
//            System.out.println("x: "+ x +" y: "+y);

            // 4방향 확인
            for(int t=0; t<dx.length; t++){
                int nx = x + dx[t];
                int ny = y + dy[t];
                // 영역밖
                if(nx < 0 || nx >=n || ny < 0 || ny >= m) continue;;
                // 0 인영역 continue
                if(graph[nx][ny] == 0) continue;
                // 처음 방문시에만 거리 기록
                if(graph[nx][ny] == 1){
                    graph[nx][ny] = graph[x][y]+ 1;
//                    System.out.println(" nx: "+ nx +" ny: "+ny + "  "+graph[nx][ny]);
                    q.offer(new Node(nx,ny));
                }

            }
        }

        return graph[n-1][m-1]; // 도착지 좌표

    }

    public static void main(String[] args) {

        // 입력
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i=0; i<n; i++){
            String str = scanner.next();
            for (int j=0; j<m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        //입력 E

        System.out.println(bfs(0,0));

    }
}