import java.util.HashMap;
import java.util.LinkedHashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        /** 삼중 for문*/
//        for(int i=0;i< photo.length;i++){
//            for(int j=0;j<photo[i].length;j++){
//                for(int p=0;p<name.length;p++){
//                    if(photo[i][j].equals(name[p])) answer[i]+=yearning[p];
//                }
//            }
//        }

        /**HashMap*/
        HashMap<String,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }

        for(int i=0;i<photo.length;i++){
            String[] persons = photo[i];
            int score =0;

            for(int j=0;j< persons.length;j++){
                String person = persons[j];
                if(map.containsKey(person)) score+=map.get(person);
            }

            answer[i]= score;
        }
        return answer;
    }
}