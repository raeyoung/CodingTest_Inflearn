package Array;

import java.util.Scanner;

// 소수 (에라토테네스 체)
public class Section2_05 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1]; // n번 인덱스까지 생성해야되기 때문에 +1
        for(int i=2 ; i<n ; i++) {
            if(ch[i] == 0) { // 소수
                answer++;
                for(int j=i ; j<n ; j=j+i) { // j 가 i 배수로 돌아야 하기 때문에 j+i
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section2_05 s = new Section2_05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.solution(n));
    }
}
