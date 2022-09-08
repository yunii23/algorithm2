package algorithm2.Programmers.Level1;

import java.util.Arrays;

public class java_12954 {
    // 프로그래머스 레벨1 x만큼 간격이 있는 n개의 숫자

    public static void main(String[] args) {
        int x = 2;
        int sum = x;
        int n = 5;

        long[] answer = new long[n];

        for(int i=0; i<n; i++) {
            answer[i] = sum;
            sum += x;
        }

        System.out.println(Arrays.toString(answer));
    }
}
