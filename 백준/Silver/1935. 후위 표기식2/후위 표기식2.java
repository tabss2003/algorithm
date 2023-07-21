import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String term = st.nextToken();

        HashMap<Character,Integer> map = new HashMap<>();
        char ch ='A';
        for(int i=0;i<num;i++) map.put(ch++, Integer.parseInt(br.readLine()));

        Stack<Double> stack = new Stack<>();
        for(int i=0;i<term.length();i++){
            char word = term.charAt(i);
            if('A'<=word && word<='Z') stack.push((double)map.get(word));
            else{
                double b = stack.pop();
                double a = stack.pop();

                switch (word){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                }
            }
        }
        System.out.println(String.format("%.2f",stack.pop()));
    }
}
