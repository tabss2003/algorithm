import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][3];
        Arrays.fill(dp[1],1);

        for(int i=2;i<=N;i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) %9901; // 업소
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) %9901;// 좌
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) %9901;// 으ㅜ
        }
        int sum = 0;
        for(int i=0;i<3;i++){
            sum+=dp[N][i];
        }
        System.out.println(sum%9901);
    }

}
