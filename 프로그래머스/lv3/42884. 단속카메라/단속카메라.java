import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes,(o1,o2)-> o1[1]-o2[1]);

        int min = Integer.MIN_VALUE;
        for(int[] route: routes){
            if(min<route[0]){ // 진출시간보다 진입시간이 클 경우, 최소위치 바꿔주기
                min = route[1];
                answer++;
            }
        }
        return answer;
    }
}