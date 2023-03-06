import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arrSum = new int[N+1];
        for(int i=1;i<=N;i++){
            arrSum[i] = arrSum[i-1] + Integer.parseInt(st.nextToken());
        }
        int result =0;
        for(int m=1;m<=M;m++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            result = arrSum[j]-arrSum[i-1];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
