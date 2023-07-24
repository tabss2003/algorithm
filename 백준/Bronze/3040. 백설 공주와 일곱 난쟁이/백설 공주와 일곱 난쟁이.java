import java.io.*;
import java.util.*;
public class Main {
    static List<Integer> hatNumberList;
    static int[] sevens= new int[7];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        hatNumberList = new ArrayList<>();
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            int hatNum = Integer.parseInt(st.nextToken());
            hatNumberList.add(hatNum);
        }
        combination(0,0);
    }
    static void combination(int start,int count){
        if(count == 7){
            int total = 0;
            for(int i=0;i<sevens.length;i++){
                total +=sevens[i];
            }
            if(total == 100){
                for(int i=0;i<sevens.length;i++) System.out.println(sevens[i]);
            }
            return;
        }
        for(int i=start;i<hatNumberList.size();i++){
            sevens[count] = hatNumberList.get(i);
            combination(i+1, count+1);
        }

    }
}
