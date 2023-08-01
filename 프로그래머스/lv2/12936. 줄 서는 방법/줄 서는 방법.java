import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        
        long f =1;
        for(int i=1;i<=n;i++){
            list.add(i);
            f *=i;
        }
        
        k--;
        int idx =0;
        while(idx<n){
            f /= n-idx; // 단위
            answer[idx++] = list.remove((int)(k/f)); // 구할 인덱스
            k %=f; // 빠진 단위만큼 변경
            
        }
        
        return answer;
    }
    
}