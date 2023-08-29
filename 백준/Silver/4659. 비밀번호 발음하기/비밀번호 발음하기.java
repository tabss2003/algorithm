import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = br.readLine();
            if(input.equals("end")) break;

            sb.append("<").append(input).append("> is ");
            if(!isChecked(input)){
                sb.append("not ");
            }
            sb.append("acceptable.").append("\n");
        }
        System.out.println(sb.toString());
    }
    static boolean isChecked(String str){
        char[] temp = str.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(int i=0;i<temp.length;i++){
            charList.add(temp[i]);
        }
        // 모음 포함 확인
        if(!(charList.contains('a')
                || charList.contains('e')
                || charList.contains('i')
                || charList.contains('o')
                || charList.contains('u'))){
            return false;
        }

        // 자음 혹은 모음 연속 3개 확인
        for(int i=2;i<temp.length;i++){
            if(isMo(temp[i])){
                if(isMo(temp[i-1]) && isMo(temp[i-2])){
                    return false;
                }
            }else {
                if (!isMo(temp[i-1]) && !isMo(temp[i-2])){
                    return false;
                }
            }
        }
        // ee,oo 제외 연속2개 확인
        for(int i=1;i<temp.length;i++){
            if(temp[i]== temp[i-1]){
                if(temp[i] != 'e' && temp[i]!='o'){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isMo(Character c){
        return(c == 'a' || c=='e' ||c== 'i' || c=='o' || c == 'u');
    }
}
