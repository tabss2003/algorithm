import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days =10;
        
        HashMap<String,Integer> wish = new HashMap<>();
        for(int i=0;i<want.length;i++){
            wish.put(want[i],number[i]);
        }
        
        
        for(int i=0;i<discount.length-days+1;i++){
            HashMap<String,Integer> canBuy = new HashMap<>();
            
            // 일별 10일간의 할인 정보 저장
            for(int j=0;j<days;j++){
                if(canBuy.containsKey(discount[i+j])) canBuy.put(discount[i+j],canBuy.get(discount[i+j])+1);
                else canBuy.put(discount[i+j],1);
            };
            
            Boolean isEquals = true;
            
            
            // 제품 목록과 할인 정보 수량 일치여부 체크
            for(String key : wish.keySet()){
                if(wish.get(key) != canBuy.get(key)){
                    isEquals = false;
                    break;
                }
            }
            
            if(isEquals)answer+=1;
                
        }
        return answer;
        
    }
}