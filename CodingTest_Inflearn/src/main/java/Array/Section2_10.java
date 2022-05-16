package Array;

import java.util.Scanner;

// 봉우리
public class Section2_10 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                boolean flag = true;
                for(int k=0 ; k<4 ; k++) {
                    int nx = i + dx[k];     // 행 좌표
                    int ny = j + dy[k];     // 열 좌표
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;   // 봉우리가 아님
                        break;
                    }
                }
                if(flag) answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_10 s = new Section2_10();
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
