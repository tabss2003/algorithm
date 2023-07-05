import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Map<String, Integer> todaySellBook = new HashMap<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String bookTitle = st.nextToken();

            if(todaySellBook.isEmpty() || !todaySellBook.containsKey(bookTitle)){
                todaySellBook.put(bookTitle,1);
            }else{
                int sell = todaySellBook.get(bookTitle);
                todaySellBook.put(bookTitle,sell+1);
            }
        }

        int max = 0;
        for(String title : todaySellBook.keySet()){
            max = Math.max(max,todaySellBook.get(title));
        }

        List<String> list = new ArrayList<>(todaySellBook.keySet());
        Collections.sort(list);
        for(String title : list){
            if(todaySellBook.get(title) == max){
                System.out.println(title);
                break;
            }
        }


    }
}