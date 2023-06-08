import java.util.*;
class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String,Node> members = new LinkedHashMap<>();
        members.put("-",new Node(null));

        for(int i=0;i<enroll.length;i++){
            String name = enroll[i];
            String recommender = referral[i];
            members.put(name, new Node(members.get(recommender)));
        }

        for(int i=0;i<seller.length;i++){
            Node member = members.get(seller[i]);
            member.calSellAmount(amount[i] * 100);
        }

        int[] answer = new int[enroll.length];
        int index=0;
        for(String name : members.keySet()){
            if(name.equals("-")) continue;
            answer[index++] = members.get(name).sellAmount;
        }

        return answer;
    }
    class Node{
        Node recommender;
        int sellAmount;

        public Node(Node recommender){
            this.recommender = recommender;
            this.sellAmount =0;
        }
        public void calSellAmount(int income){
            if(!(this.recommender == null)){
                int outcome = income /10;
                recommender.calSellAmount(outcome);
                income-=outcome;
            }
            this.sellAmount += income;
        }
    }
}