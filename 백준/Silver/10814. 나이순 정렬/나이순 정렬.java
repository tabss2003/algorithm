import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       String[][] member = new String[n][2];
       for(int i=0;i<n;i++) {
           st = new StringTokenizer(br.readLine());
           member[i][0] = st.nextToken();
           member[i][1] = st.nextToken();
       }
       
       Arrays.sort(member,new Comparator<String[]>(){
           @Override
           public int compare(String[] o1,String[] o2){
               return Integer.compare(Integer.parseInt(o1[0]),Integer.parseInt(o2[0]));
           }
       });
       
       for(int i=0;i<n;i++){
           System.out.println(member[i][0] +" "+member[i][1]);
       }
    }

}
