package String;

import java.util.Scanner;

// 문장 속 단어 (indexOf(), sustring())
public class Section1_03 {

    public String solution(String str) {
        String answer = "";

        // 1. split 사용'
        //int max = Integer.MIN_VALUE;
        /*
            String[] s = str.split(" ");
            for(String x : s) {
            int len = x.length();   // 단어 len 에 저장
            if(len > max) {         // 값을 비교
                max = len;          // 최대값 갱신
                answer = x;
            }
        }
        */

        // 2. indexOf(), subString() 사용
        int max = Integer.MIN_VALUE, pos;
        // 첫번째로 발견되는 띄어쓰기 위치 반환 (발견하지 못하면 -1 반환해줌)
        while((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > max) { // = 를 사용하면 뒤에서 동일한 길이의 단어 발견시 해당 단어로 변경됨
                max = len;
                answer = tmp;
            }
            str = str.substring(pos +1);
        }
        // 문장 내에서 마지막 단어에는 공백이 없어 위 while문을 타지 않기 때문에 아래 내용 추가
        if(str.length() > max) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Section1_03 s = new Section1_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(s.solution(str));
    }
}
