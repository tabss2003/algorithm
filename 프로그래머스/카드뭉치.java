import java.io.IOException;

public class 카드뭉치 {
    public static void main(String[] args) throws IOException {
        String[] cards1={"i", "drink", "water"};
        String[] cards2={"want", "to"};
        String[] goal={"i", "want", "to", "drink", "water"};
        String result = solution(cards1,cards2,goal);
        System.out.println("result = " + result);
    }
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1=0;
        int card2=0;
        for(String str : goal){
            if(cards1.length> card1 && str.equals(cards1[card1])){
                card1 ++;
                continue;
            }else if (cards2.length> card2 && str.equals(cards2[card2])){
                card2 ++;
                continue;
            }else{
                answer="No";
            }
        }

        return answer;
    }
}