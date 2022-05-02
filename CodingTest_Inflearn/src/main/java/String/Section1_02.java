package String;

import java.util.Scanner;

// 대소문자 변환
public class Section1_02 {
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
            // if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            // else answer += Character.toLowerCase(x);

            // 아스키코드 : 65~90(대문자), 97~122(소문자) 대소문자차이는 32(97-65)
            if(x >= 97 && x <= 122) answer+= (char)(x-32);
            else answer += (char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section1_02 s = new Section1_02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
