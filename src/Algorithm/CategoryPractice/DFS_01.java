package Algorithm.CategoryPractice;

import java.util.Scanner;

public class DFS_01 {
    public static int n,m;
    public static int[][] graph = new int[1000][1000]; // 인접 행렬

    public static boolean dfs(int x, int y){
        System.out.println("x: "+x+" y:"+y);

        // 범위밖 종료
        if(x<0 || x >=n || y<0 || y>=m){
            return false;
        }

        if(graph[x][y] == 0){
            System.out.println("visited");
            // 노드 방문처리
            graph[x][y] = 1;
            // 상하 좌우 모두 체크
            dfs(x-1,y);
            dfs(x+1, y);
            dfs(x,y-1);
            dfs(x,y+1);

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i=0; i< n; i++){
            String str = scanner.next();
            for(int j=0; j<m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        // 입력 E



        int result = 0;
        for(int i=0; i< n; i++){
            System.out.println(i+": <");
            for(int j=0; j<m; j++){
//                System.out.println(graph[i][j]);
                if(dfs(i,j)){
                    System.out.println("TRUE");
                    result++;
                } else {
                    System.out.println("false");
                }
            }
        }

        System.out.println();
        System.out.println(result);


    }
}
