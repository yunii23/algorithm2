package algorithm2.Programmers.Level1;

public class java_12931 {
    // 프로그래머스 레벨1 자릿수 더하기

    public static void main(String[] args) {
        int n = 123;
        int answer = 0;

        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
    }
}
