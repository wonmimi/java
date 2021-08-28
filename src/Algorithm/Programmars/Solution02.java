package Algorithm.Programmars;

public class Solution02 {
    int[][] graph;

    // 상하 좌우 방향
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};

    public boolean dfs(int x, int y, int size){
        // System.out.println("x: "+x+" y:"+y);
        if(x < 0 || x>= size || y<0 || y>=size) return false;
        if(graph[x][y] == 1){
            // System.out.println(" visited");
            graph[x][y] = 0;
            for(int t =0; t< dx.length; t++){
                int nx = x + dx[t];
                int ny = y+ dy[t];
                dfs(nx, ny, size);
            }
            return true;
        } else {
            return false;
        }
    }
    public int solution(int n, int[][] computers) {
        // n 컴퓨터 갯수 (n * n)
        // computers => graph

        graph = new int[n][n];
        graph = computers;

        int answer = 0;
        for(int i=0; i< graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                // System.out.print(graph[i][j]+ " ");
                if(dfs(i,j,n)){
                    answer++;
                    // System.out.println("-----"+answer);
                }
            }
            // System.out.println();
        }





        System.out.println(answer);


        return answer;
    }
}
