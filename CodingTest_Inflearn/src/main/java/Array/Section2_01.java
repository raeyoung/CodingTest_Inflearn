package Array;

import java.util.ArrayList;
import java.util.Scanner;

// 큰 수 출력하기
public class Section2_01 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); // 맨 앞 숫자는 무조건 출력
        for(int i=1 ; i<n ; i++) {
            if(arr[i] > arr[i-1]) answer.add(arr[i]);   // 값 비교
        }

        return answer;
    }

    public static void main(String[] args) {
        Section2_01 s = new Section2_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : s.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
