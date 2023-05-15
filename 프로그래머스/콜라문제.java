import java.io.IOException;

public class 콜라문제 {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(2,1,20));
        System.out.println(solution(3,1,20));

    }
    //a 주어야 하는 빈병, b 콜라병 수 , 성빈이가 가진빈 병의 개수 n
    public static int solution(int a, int b, int n) {

        int answer = 0; // 총 상빈이가 받을 수 있는 콜라 병 수

        while(true){
            // 주어야하는 빈 병 수> 가지고 있는 빈 병 수일 경우 return
            if(a>n) break;

            // 주어야 하는 빈 병 수 < 가지고 있는 빈 병 수  시작
            answer += (n/a)*b;
            int remain = (n%a); // 마트에게 주지 못한 개수, 나머지

            n = (n/a)*b +remain;
        }

        return answer;
    }
}
