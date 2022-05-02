package String;

import java.util.Scanner;

// 암호 (replace(), parseInt(string, 2))
public class Section1_12 {
    public String solution(int n, String s) {
        String answer = "";
        for(int i=0 ; i<n ; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2); // 2진수로 변환
            answer += (char)num;    // 10진수로 변환
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_12 s = new Section1_12();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(s.solution(num, str));
    }
}
