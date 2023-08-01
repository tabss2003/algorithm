import java.io.*;
import java.util.*;
public class Main {
    static int N,answer;
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        board = new char[N][N];

        for(int i=0;i<N;i++){
            String input = br.readLine();
            for(int j=0;j<N;j++){
                board[i][j] = input.charAt(j);
            }
        }

        answer =0;

        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                // 가로로 인접한 두 문자 교환
                char temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;

                check();
                // 교환한 문자 복구
                temp = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = temp;

            }
        }


        for(int j=0;j<N;j++){
            for(int i=0;i<N-1;i++){
                // 세로로 인접한 두 문자 교환
                char temp = board[i][j];
                board[i][j] = board[i+1][j];
                board[i+1][j] = temp;

                check();

                temp = board[i][j];
                board[i][j] = board[i+1][j];
                board[i+1][j] = temp;

            }
        }
        System.out.println(answer);

    }

    public static void check(){
        // 오른쪽 비교
        for(int i=0;i<N;i++){
            int cnt =1;
            for(int j=0;j<N-1;j++){
                if(board[i][j]==board[i][j+1]){
                    cnt++;

                }else{
                    cnt=1;
                }
                answer = Math.max(answer,cnt);
            }
        }

        // 아래쪽 비교
        for(int j=0;j<N;j++){
            int cnt =1;
            for(int i=0;i<N-1;i++){
                if(board[i][j]== board[i+1][j]){
                    cnt++;
                }else{
                    cnt=1;
                }
                answer = Math.max(answer,cnt);
            }
        }
    }


}
