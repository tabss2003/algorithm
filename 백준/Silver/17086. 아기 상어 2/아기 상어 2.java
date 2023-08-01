import java.io.*;
import java.util.*;
public class Main {
    static public class Shark{
        int x;
        int y;
        public Shark(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,1,-1,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] board = new int[N][M];
        int[][] visited = new int[N][M];
        Queue<Shark>queue = new LinkedList<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = Integer.MAX_VALUE;
                if(board[i][j] == 1){
                    queue.add(new Shark(i,j));
                    visited[i][j] = 0;
                }
            }
        }

        int answer=0;
        while(!queue.isEmpty()){
            Shark temp = queue.poll();

            for(int d=0;d<8;d++){
                int nx = temp.x+dx[d];
                int ny = temp.y+dy[d];

                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(visited[nx][ny] > visited[temp.x][temp.y]+1){
                        visited[nx][ny] = visited[temp.x][temp.y]+1;
                        answer= Math.max(answer,visited[nx][ny]);
                        queue.add(new Shark(nx,ny));
                    }
                }
            }
        }
        System.out.println(answer);


    }




}
