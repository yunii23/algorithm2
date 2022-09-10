package algorithm2.Programmers.Level1;

import java.util.Arrays;

public class java_12940 {
    // 프로그래머스 레벨1 최대공약수와 최소공배수

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] answer = new int[2];

        if(n >= m) {
            answer[0] = gcb(n, m);
            answer[1] = lcm(n, m);
        }
        else {
            answer[0] = gcb(m, n);
            answer[1] = lcm(m, n);
        }

        System.out.println(Arrays.toString(answer));
    }

    public static int gcb(int n, int m) {
        while(m > 0) {
            int temp = n;
            n = m;
            m = temp % m;
        }
        return n;
    }

    public static int lcm(int n, int m) {
        return n * m / gcb(n, m);
    }
}
