import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            Stack<Character> stack = new Stack<>();
            for(int j=0;j<input.length();j++){
                char in = input.charAt(j);

                if(in == '('){
                    stack.push(in);
                } else if(stack.empty()) {
                    stack.push(in);
                    break;
                } else {
                    stack.pop();
                }
            }

            if(stack.isEmpty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");;
        }
        System.out.print(sb);
    }

}