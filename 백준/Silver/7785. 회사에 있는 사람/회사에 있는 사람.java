import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Set<String> stayEmployee = new HashSet<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String check = st.nextToken();

            if(stayEmployee.isEmpty() || !stayEmployee.contains(name)){
                stayEmployee.add(name);
            }else if(stayEmployee.contains(name)){
                if(check.equals("leave")){
                    stayEmployee.remove(name);
                }
            }
        }

        List<String> list = new ArrayList<>(stayEmployee);
        Collections.sort(list,Collections.reverseOrder());
        
        for(String name : list) System.out.println(name);

    }
}