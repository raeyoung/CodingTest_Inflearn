package String;

import java.util.Scanner;

// 숫자만 추출
public class Section1_09 {
    public int solution(String s) {
        // 1. 아스키 코드 사용
        /*
        int answer = 0;
        for(char x : s.toCharArray()) {
            if(x>=48 && x<=57) {  // 문자로 된 숫자
                answer = answer * 10 + (x - 48);    // x값으로 차례대로 넘어오는 문자형숫자('0'~'9')를 합쳐서 10진수화 하는 방법
                // + 연산을 사용하게 되면 x는 아스키코드로 변환됨 => x가 0이 아니라 48
            }
        }
        */

        // 2. String 사용하여 parseInt 하는 방법
        String answer = "";
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {  // 숫자인 경우
                answer += x;
            }
        }

        return Integer.parseInt(answer);    // 맨 앞이 0인 경우 숫자로 변형되어 0이 사라짐
    }

    public static void main(String[] args) {
        Section1_09 s = new Section1_09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(s.solution(str));
    }
}
