package algorithm2.Programmers.Level1;

public class java_12947 {
    // 프로그래머스 레벨1 하샤드 수

    public static void main(String[] args) {
        int x  = 13;
        int value = x;
        int sum = 0; // 자릿수 합

        boolean answer = true;

        if(x < 10) System.out.println(answer);
        else {

            while(x != 0) {
                sum += (x % 10);
                x /= 10;
            }

            if(value % sum == 0) System.out.println(answer);
            else {
                answer = false;
                System.out.println(answer);
            }
        }
    }
}
