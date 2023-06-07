import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        int index =0;
        while(!queue.isEmpty()){
            index++;
            int temp = queue.poll();
            if(index % k ==0) list.add(temp);
            else queue.add(temp);
        }
        System.out.println(list.toString().replace("[","<").replace("]",">"));
    }
}