package String;

import java.util.Scanner;

// 문자거리
public class Section1_10 {
    // 가장 짧은 문자거리
    // 문자와 떨어진 거리를 구하고 왼쪽으로 1번, 오른쪽으로 1번 돌리고서 숫자가 작은 걸 answer 로 출력해야함
    // 거리 1씩 증가하고 동일한 값인 경우 0으로
    // 예시 teachermode e / 1 0 1 2 1 0 1 2 2 1 0
    public int[] solution(String s, char t) {
        int [] answer = new int[s.length()];
        int p = 1000;   // 최초의 거리는 큰 값으로 설정함
        // 왼쪽으로부터 떨어진 거리
        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
              p++;
                answer[i] = p;
            }
        }
        // 오른쪽으로부터 떨어진 거리
        p = 1000; // 초기화
        for(int i=s.length()-1 ; i>=0 ; i--) {
            if(s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);    // 값 비교하여 작은 값으로
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_10 s = new Section1_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int x : s.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
