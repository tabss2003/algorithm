import java.io.IOException;

public class 옹알이 {
    public static void main(String[] args) throws IOException {

    }
        public int solution (String[]babbling){
            int answer = 0;

            String[] speek = {"aya", "ye", "woo", "ma"};
            for (String ba : babbling) {
                ba = ba.replaceFirst("aya", " ");
                ba = ba.replaceFirst("ye", " ");
                ba = ba.replaceFirst("woo", " ");
                ba = ba.replaceFirst("ma", " ");

                if (ba.isBlank()) answer++;
            }
            return answer;
        }
    }

