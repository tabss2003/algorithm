import java.io.IOException;

public class 다음에올숫자 {
    public static void main(String[] args) throws IOException {
        //2, 4, 8
//        int[] common = {1, 2, 3, 4};
        int[] common = {2, 4, 8};
        int result = solution(common);
        System.out.println("result = "+result);
    }
    public static int solution(int[] common) {
        int answer = 0;

        int num1 = common[0];
        int num2 = common[1];
        int num3  = common[2];

        int d1 = num2-num1;
        int d2 = num3-num2;
        // 등차 수열
        if(d1 == d2){
            answer = common[common.length-1]+d1;
        }
        //등비 수열
        else{
            d2 = num3/num2;
            answer = common[common.length-1]*d2;
        }
        return answer;
    }
}
