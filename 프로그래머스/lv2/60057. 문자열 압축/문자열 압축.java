class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 1; // 반복되는 규칙 횟수 
        for(int i=1;i<=s.length()/2;i++){
            StringBuilder result = new StringBuilder();
            String base = s.substring(0,i);
            
            for(int j=i;j<=s.length();j+=i){
                int endIdx = Math.min(j+i,s.length()); // 인덱스 길이 못넘음
                String compare = s.substring(j,endIdx);
                if(base.equals(compare)){
                    count++;
                }else{
                    if(count>=2) result.append(count);
                    result.append(base);
                    base = compare; 
                    count =1;
                }
            }
            result.append(base);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}