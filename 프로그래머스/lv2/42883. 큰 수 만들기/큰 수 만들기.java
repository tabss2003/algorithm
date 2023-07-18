import java.util.*;

class Solution {
    public String solution(String number, int k) {
        char[] anwser = new char[number.length()-k];
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<number.length();i++){
            char c = number.charAt(i);
            
            while(!stack.isEmpty() && stack.peek() < c && (k--) > 0){
                stack.pop();
            }
            stack.push(c);
        }
        
        for(int i=0;i<anwser.length;i++) anwser[i] = stack.get(i);
        
        return new String(anwser);
    }
}