import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 길이가 n인 수열에서 인접하면서 동일한 수열이 있는 경우는 동일한 수열의 길이가 최소 1부터 최대 n/2인 경우 발생
 * 가장 마지막에 집어 넣은 수 기준으로
 * 마지막 1개와 그 앞의 1개의 수가 동일한지,
 * 마지막 2개와 그 앞의 2개가 동일한지,,,,, 마지막 n/2개까지 비교해서 동일하다면 나쁜 수열
 * 가장 첫 번째로 나오는 백트래킹 알고리즘 결과가 가장 작은 수 !!!!!
 **/
public class Main {
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        backTracking("");

    }
    public static void backTracking(String str){
        if(str.length() == n){
            System.out.println(str);
            System.exit(0);
            return;
        }

        for(int i=1;i<=3;i++){
            if(condition(str+i)) backTracking(str+i);
        }
    }
    public static boolean condition(String str){
        for(int i=1;i<=str.length()/2;i++){
            String frontStr = str.substring(str.length()-i-i,str.length()-i);
            String rearStr = str.substring(str.length()-i,str.length());
            if(frontStr.equals(rearStr)) return false;
        }
        return true;
    }
}