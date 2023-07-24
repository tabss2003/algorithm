import java.io.*;
import java.util.*;
public class Main {
    static int k,n;
    static int[] arr;
    static boolean[] visited;
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited= new boolean[n];
        for(int i=0;i<n;i++){
            st= new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        permutation(0,"");
        System.out.println(set.size());

    }
    static void permutation(int choiceIdx, String num){
        if(choiceIdx == k){
            set.add(num);
            return;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                permutation(choiceIdx+1,num+arr[i]);
                visited[i] = false;
            }
        }
    }
}
