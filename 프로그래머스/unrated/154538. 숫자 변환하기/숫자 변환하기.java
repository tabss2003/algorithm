import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        answer = bfs(x,y,n);
        return answer;
    }
    public int bfs(int x, int y, int n){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        int depth =0;
        
        queue.add(x);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0;i<size;i++){
                int temp = queue.poll();
                
                if(temp == y) return depth;
                
                if(temp * 2<= y && !visited.contains(temp * 2)){
                    queue.add(temp *2);
                    visited.add(temp *2);
                }
                if(temp * 3<= y && !visited.contains(temp * 3)){
                    queue.add(temp *3);
                    visited.add(temp *3);
                }
                if(temp +n<= y && !visited.contains(temp +n)){
                    queue.add(temp +n);
                    visited.add(temp +n);
                }
            }
            depth++;
        }
        return -1;
    }
}