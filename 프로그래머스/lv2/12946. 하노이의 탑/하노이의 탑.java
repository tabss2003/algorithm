import java.util.*;
class Solution {
    ArrayList<int[]> list;
    public int[][] solution(int n) {
        list = new ArrayList<>();
        hanoi(n,1,3,2);
        int[][] answer = new int[list.size()][2];
        
        for(int i=0;i<list.size();i++){
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
        }
        return answer;
    }
    public void hanoi(int n, int from, int to, int IC){
        if(n==1){
            list.add(new int[] {from,to});
            return;
        }else{
            hanoi(n-1,from,IC,to);
            list.add(new int[] {from,to});
            hanoi(n-1,IC,to,from);
        }
    }
}