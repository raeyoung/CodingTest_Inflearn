package Array;

import java.util.Scanner;

// 보이는 학생
public class Section2_02 {
    public int solution(int n, int[] arr) {
        int answer = 1; // 첫번째 사람은 무조건 보인다
        int max = arr[0];
        for(int i=1 ; i<n ; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section2_02 s = new Section2_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(s.solution(n, arr));
    }
}
