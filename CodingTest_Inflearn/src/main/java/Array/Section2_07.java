package Array;

import java.util.Scanner;

// 점수 계산
public class Section2_07 {
    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;

        for(int i=0 ; i<n ; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_07 s = new Section2_07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(s.solution(n, arr));
    }
}
