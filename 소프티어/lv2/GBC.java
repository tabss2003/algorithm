import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://softeer.ai/practice/info.do?idx=1&eid=584
// GBC
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] limit = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            limit[i][0] = Integer.parseInt(st.nextToken()); // 거리
            limit[i][1] = Integer.parseInt(st.nextToken()); // 속도
        }
        int[][] ingSpeed = new int[M][2];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            ingSpeed[i][0] = Integer.parseInt(st.nextToken()); // 거리
            ingSpeed[i][1] = Integer.parseInt(st.nextToken()); // 속도
        }

        int answer =0;
        int idx =0;
        for(int i=0;i<N;i++){
            for(int j=idx;j<M;j++){
                if(limit[i][0] < ingSpeed[j][0]){
                    ingSpeed[j][0] -= limit[i][0];
                    if(ingSpeed[j][1] - limit[i][1] > 0) answer = Math.max(answer,
                            ingSpeed[j][1]-limit[i][1]);
                    break;
                }else if(limit[i][0]> ingSpeed[j][0]){
                    limit[i][0] -= ingSpeed[j][0];
                    if(ingSpeed[j][1] - limit[i][1] > 0) answer = Math.max(answer,
                            ingSpeed[j][1]-limit[i][1]);
                    idx++;
                }else{
                    if(ingSpeed[j][1] - limit[i][1] > 0) answer = Math.max(answer,
                            ingSpeed[j][1]-limit[i][1]);
                    idx++;
                    break;
                }
            }
        }
        System.out.println(answer);


    }
}