import java.util.Scanner;

// 특정 문자 뒤집기 (toCHarArray())
public class Section1_05 {
    // lt, rt 가 영문자인지 특수문자인지 확인 필요
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length() - 1;  // lt: 첫번째 인덱스, rt: 끝 인덱스
        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {    // 알파벳이 아니라면
                lt++;
            } else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c); // String 으로 변환
        return answer;
    }

    public static void main(String[] args) {
        Section1_05 s = new Section1_05();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(s.solution(str));
    }
}
