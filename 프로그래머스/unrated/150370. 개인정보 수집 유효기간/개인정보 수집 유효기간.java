import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms,String[] privacies){
        int[] answer = {};

        Map<String, Integer> termsMap = new HashMap<>();
        for(String term : terms){
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0],Integer.parseInt(termSplit[1]));
        }

        List<Integer> result = new ArrayList<>();
        int privaciesNumber = 1;

        int todayTotalDate = getTotalDate(today,0);
        for(String p : privacies){
            String[] privateSplit = p.split(" ");

            String privateDate = privateSplit[0];
            int termsMonth = termsMap.get(privateSplit[1]);

            int privateTotalDate  = getTotalDate(privateDate,termsMonth)-1;

            if(privateTotalDate < todayTotalDate){
                result.add(privaciesNumber);
            }
            privaciesNumber++;
        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
    static public int getTotalDate(String strDate, Integer termsMonth){
        String[] dateSplit = strDate.split("\\.");
        int year = Integer.valueOf(dateSplit[0]);
        int month = Integer.valueOf(dateSplit[1])+ termsMonth;
        int day = Integer.valueOf(dateSplit[2]);

        // 일로 바꾸기
        return (year * 12 * 28)  + (month * 28) +day;
    }

}