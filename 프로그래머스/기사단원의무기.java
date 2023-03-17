import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 기사단원의무기 {
    public static void main(String[] args) {
//        int number =5;
//        int limit =3;
//        int power=2;
        int number =10;
        int limit =3;
        int power=2;
        int result = solution(number, limit, power);
        System.out.println("result = " + result);
    }
    static public int solution(int number, int limit, int power) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        int count =0; //약수 개수

        //약수구하기
        for(int i=1;i<=number;i++){
            count=0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) count++;
                else if(i % j ==0) count+=2;
            }
            list.add(count);
        }


        for(int i=0;i<list.size();i++){
            if(list.get(i)>limit) {
                list.remove(i);
                list.add(i,power);
                answer+=list.get(i);
            }else{
                answer+=list.get(i);
            }
        }

        return answer;
    }


}