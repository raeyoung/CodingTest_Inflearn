package Array;

import java.util.ArrayList;
import java.util.Scanner;

// 뒤집은 소수
public class Section2_06 {
    // 소수 판별
    public boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i=2 ; i<num ; i++) {
            if(num%i==0) return false;
        }
        return true;

    }
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0 ; i<n ; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10; // 나머지 구하기
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
    //값 입력
    public static void main(String[] args) {
        Section2_06 s = new Section2_06();
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
