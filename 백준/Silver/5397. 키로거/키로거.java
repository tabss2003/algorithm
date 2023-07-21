import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(st.nextToken()); 
		for(int tc=0;tc<count;tc++) {
			st = new StringTokenizer(br.readLine());
			String keywords = st.nextToken();
            
			Stack<Character> words = new Stack<>();
			Stack<Character> arrows = new Stack<>();
            
			for(int i=0;i<keywords.length();i++) {
                char keyword = keywords.charAt(i);
                switch(keyword){
                    case '<':
                        if(!words.empty()) arrows.push(words.pop());
                        break;
                    case '>':
                        if(!arrows.empty()) words.push(arrows.pop());
                        break;
                    case '-':
                        if(!words.empty()) words.pop();
                        break;
                    default:
                        words.push(keyword);
                        break;
                }
			}
			while(!arrows.empty()) {
				words.push(arrows.pop());
			}
			
            for(int j=0;j<words.size();j++){
                sb.append(words.elementAt(j));
            }
            sb.append("\n");
		}
        System.out.println(sb);
	}
}
