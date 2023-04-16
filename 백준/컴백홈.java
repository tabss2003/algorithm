import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 컴백홈 {
    static boolean[][] visited;
    static int[] dr ={0,1,0,-1};
    static int[] dc ={1,0,-1,0};
    static int R,C,K,ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        visited = new boolean[R][C];
        for(int i=0;i<R;i++){
            String input = br.readLine();
            for(int j=0;j<C;j++){

                if(input.charAt(j)=='T') visited[i][j] =true;
            }
        }

        visited[R-1][0] = true; // 현수가 있는 위치 방문 처리
        dfs(1,R-1,0);
        System.out.println(ans);

    }
    public static void dfs(int depth, int r, int c){
        if(depth>=K){ // 방문한 수가 이미 K보다 크거나 같으면 추가 탐색 x
            if(r ==0 && c == C-1 && depth == K){ // 도착위치이면서 방문횟수가 K랑 같을 때만 경로수 추가
                ans++;
            }
            return; // 추가탐색 x
        }

        for(int d=0;d<4;d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(nr>=0 && nr<R && nc >=0 && nc<C){
                if(!visited[nr][nc]){
                    visited[nr][nc]=true;
                    dfs(depth+1,nr,nc);
                    visited[nr][nc]=false;
                }
            }
        }
    }
}
