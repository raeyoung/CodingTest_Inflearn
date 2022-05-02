package Array;

import java.util.Scanner;

// 가위 바위 보
public class Section2_03 {
    public String Solution(int n, int[] a, int[] b) {
        String answer = "";
        for(int i=0 ; i<n ; i++) {
            if(a[i] == b[i]) answer += "D";
            else if(a[i] == 1 && b[i] == 3) answer += "A";
            else if(a[i] == 2 && b[i] == 1) answer += "A";
            else if(a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_03 s = new Section2_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0 ; i<n ; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++) {
            b[i] = sc.nextInt();
        }
        // 줄 바꿔서 배열로 출력
        for(char x : s.Solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
