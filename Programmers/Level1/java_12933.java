package algorithm2.Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class java_12933 {
    // 프로그래머스 레벨1 정수 내림차순으로 배치하기

    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;
        String s = Long.toString(n);
        String[] arr = new String[s.length()];

        int i = 0;
        while(n != 0) {
            arr[i] = Long.toString(n % 10);
            n /= 10;
            i++;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String print = "";
        for(int j=0; j<arr.length; j++) {
            print += arr[j];
        }

        answer = Long.parseLong(print);
        System.out.println(answer);
    }
}
