package Array;

import java.util.Scanner;

// 임시 반장 정하기
public class Section2_11 {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for(int i=1 ; i<=n ; i++) {
            int cnt = 0;
            for(int j=1 ; j<=n ; j++) {
                for(int k=1 ; k<=5 ; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_11 s = new Section2_11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];  // n+1 : 1번부터 사용할 예정

        for(int i=1 ; i<=n ; i++) { // 학생 번호
            for(int j=1 ; j<=5 ; j++) { // 학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(s.solution(n, arr));
    }
}
