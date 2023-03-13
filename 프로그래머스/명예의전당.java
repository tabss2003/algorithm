import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {
    public static void main(String[] args) throws IOException {
        int k =3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        solution(k,score);
    }
    static  public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i< score.length;i++){
            if(list.size()<k){
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
                continue;
            }
            if(list.size() == k){
                int min = list.get(0);
                if(min<score[i]){
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
                answer[i] = list.get(0);
            }
        }
        return answer;
    }
}
