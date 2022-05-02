package String;

import java.util.Scanner;

// 회문문자열 (앞에 읽거나 뒤에서 읽을 떄 같은 문자열)
public class Section1_07 {
    public String solution(String str) {
        // String answer = "YES";
        // 1. toUpperCase 사용하여 문자열 확인
        /*
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0 ; i<len/2 ; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                return "NO";
            }
        }
         */
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();   // 뒤집기
        if(str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Section1_07 s = new Section1_07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
