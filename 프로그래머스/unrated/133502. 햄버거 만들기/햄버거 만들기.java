import java.util.*;
class Solution {
    public int solution(int[] ingredient){
        int answer =0;
        int[] burger = {1,2,3,1};
        Stack<Integer> stack = new Stack<>();
        for(int i : ingredient){
            stack.add(i);

            if(stack.size()>=4){
                if(stack.get(stack.size()-4) == burger[0]
                        && stack.get(stack.size()-3) == burger[1]
                        && stack.get(stack.size()-2) == burger[2]
                        && stack.get(stack.size()-1) == burger[3]){
                    answer++;
                    stack.pop();stack.pop();stack.pop();stack.pop();
                }
            }
        }
        return answer;
    }
}