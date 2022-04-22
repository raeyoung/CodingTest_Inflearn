import java.util.Scanner;

// 팰린드롭 (replaceAll 정규식이용) => 앞에서 읽거나 뒤에서 읽을 때 같은 문자열
public class Section1_08 {
    // 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자 구분 X
    public String solution(String s) {
        String answer = "NO";
        // replace 는 정규식 사용 X / replaceAll 정규식 사용 O
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Section1_08 s = new Section1_08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(s.solution(str));
    }
}
