package Array;

import java.util.Scanner;

public class Section2_09 {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE; // 최대값을 찾아야하기 때문에 정수 중 가장 작은 값으로 초기화
        int sum1, sum2;
        for(int i=0 ; i<n ; i++) {
            sum1 = sum2 = 0;
            for(int j=0 ; j<n ; j++) {
                sum1 += arr[i][j];  // 행 0으로 고정 열 만 움직임
                sum2 += arr[j][i];  // 열 0으로 고정 행 만 움직임
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 대각선
        sum1 = sum2 = 0;
        for(int i=0 ; i<n ; i++) {
            sum1 += arr[i][i];      // 좌측 위 대각선
            sum2 += arr[i][n-i-1];  // 우측 위 대각선
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Section2_09 s = new Section2_09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(s.solution(n, arr));
    }
}
