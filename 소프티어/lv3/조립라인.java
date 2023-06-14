import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://softeer.ai/practice/info.do?idx=1&eid=403
// 조립라인
public class Softeer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[][] work = new int[N][2];
        int[][] move = new int[N-1][2];

        for(int i=0;i<N-1;i++) {
            st = new StringTokenizer(br.readLine());
            work[i][0] = Integer.parseInt(st.nextToken());
            work[i][1] = Integer.parseInt(st.nextToken());
            move[i][0] = Integer.parseInt(st.nextToken());
            move[i][1] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        work[N-1][0] = Integer.parseInt(st.nextToken());
        work[N-1][1] = Integer.parseInt(st.nextToken());


        int[] A_work = new int [N];
        int[] B_work = new int [N];

        A_work[0] = work[0][0];
        B_work[0] = work[0][1];

        for(int i=1;i<N;i++){
            int a = work[i][0];
            int b = work[i][1];
            int a_move = move[i-1][0];
            int b_move = move[i-1][1];

            A_work[i] = Math.min(A_work[i-1] +a , B_work[i-1]+b_move+a);
            B_work[i] = Math.min(A_work[i-1] +a_move+b , B_work[i-1]+b);
        }
        System.out.println(Math.min(A_work[N-1],B_work[N-1]));


    }
}
