import java.util.Locale;
import java.util.Scanner;

public class Section1_01 {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // System.out.println("str = " + str);

        /*
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == t) answer++;
        }
        */

        // 향상된 for문 사용
        // 배열 or iterator을 제공하는 컬렉션 프레임워크(ArrayList) 가 들어가야함 (String X)
        for(char x : str.toCharArray()) {
            if(x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_01 s = new Section1_01();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(s.solution(str, c));


    }
}
