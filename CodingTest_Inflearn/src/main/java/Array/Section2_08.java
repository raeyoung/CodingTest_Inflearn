package Array;

import java.util.Scanner;

// 등수구하기
public class Section2_08 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];  // 동적으로 선언하면 0으로 초기화

        for(int i=0 ; i<n ; i++) {
            int cnt =1;
            for(int j=0 ; j<n ; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Section2_08 s = new Section2_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : s.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
