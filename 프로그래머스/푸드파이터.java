import java.io.IOException;

public class 푸드파이터 {
    public static void main(String[] args) throws IOException {
        int[] food ={1, 3, 4, 6};
        System.out.println(solution(food));
    }
    public static String solution(int[] food) {
        String answer = "";
        int[] arr={0};

        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer+=Integer.toString(i);
            }
        }
        String plus = "";
        for(int i=answer.length()-1;i>=0;i--) plus+= answer.charAt(i);

        return answer+"0"+plus;
    }
}
