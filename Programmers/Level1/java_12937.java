package algorithm2.Programmers.Level1;

public class java_12937 {
    // 프로그래머스 레벨1 짝수와 홀수

    public static void main(String[] args) {
        int num = 3;
        String answer = "";

        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";

        System.out.println(answer);
    }
}
