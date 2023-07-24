import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       HashMap<Integer,List<String>> map = new HashMap<>();
       for(int i=0;i<n;i++) {
           st = new StringTokenizer(br.readLine());
          int age = Integer.parseInt(st.nextToken());
          String name = st.nextToken();
          List<String> values;
          if(map.containsKey(age)){
              values = map.get(age);
          }else{
              values = new ArrayList<>();
          }
           values.add(name);
           map.put(age,values);
       }
       
       for(Integer key : map.keySet()){
           for(String value : map.get(key)){
               System.out.println(key+" "+value);
           }
       }
    }

       

}
