package Array;

import java.util.Scanner;

// 피보나치 수열
public class Section2_04 {
    public int[] Solution(int n) {
        int[] answer = new int [n];
        // 1은 고정
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2 ; i<n ; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
    // 배열을 사용하지 않고 손 코딩으로 문제를 푸는 경우
    /*
    public void Solution2(int n) {
        int a=1, b=1, c;
        System.out.println(a + " " + b + " ");
        for(int i=2 ; i<n ; i++) {
            c =a+b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
    */

    public static void main(String[] args) {
        Section2_04 s = new Section2_04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : s.Solution(n)) System.out.println(x + " ");
    }
}
