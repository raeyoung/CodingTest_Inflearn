package String;

import java.util.Scanner;

// 중복문자 제거 (indexOf)
public class Section1_06 {
    public String solution(String str) {
        String answer = "";

        // indexOf 사용
        for(int i = 0 ; i < str.length() ; i++) {
            // str.charAt(i) : 해당 문자열 위치 , str.indexOf(str.charAt(i)) : 해당 문자열 처음 발견된 위치
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) {   // true 인 경우 중복 X
                answer+= str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_06 s = new Section1_06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
