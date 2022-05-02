package String;

import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기 (StringBuilder 이용법 또는 직접뒤집기)
public class Section1_04 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        // 1. reverse 사용
        /*
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();     // String 연산이 많아질 경우 StringBuilder 사용하는 것이 좋음
            answer.add(tmp);
        }
         */
        // 2. 직접 뒤집기 (아래 알고리즘은 손코딩으로도 할 수 있도록 잘 알아둘 것)
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;    // lt: 앞 문자, rt: 뒷 문자
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;    // 교환
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // 문자열을 String으로 변경
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section1_04 s = new Section1_04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i = 0 ; i < num ; i++) {
            str[i] = sc.next();
        }
        for(String x : s.solution(num, str)) {
            System.out.println(x);
        }
    }
}
