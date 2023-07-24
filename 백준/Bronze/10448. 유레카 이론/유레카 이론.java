import java.io.*;
import java.util.*;
public class Main {
    static List<Integer> hatNumberList;
    static int[] sevens= new int[7];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] triNum = new int[45];
        for(int i=1;i<45;i++){
            triNum[i]= i*(i+1)/2;
        }
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());

            int totalNum = Integer.parseInt(st.nextToken());
            int result = eureka(totalNum,triNum);
            System.out.println(result);
        }
    }
    public static int eureka(int totalNum,int[] triNum){
        for(int j=1;j<45;j++){
            for(int k=1;k<45;k++){
                for(int x=1;x<45;x++){
                    if(triNum[j]+triNum[k]+triNum[x] == totalNum) return 1;
                }
            }
        }
        return 0;
    }
}
