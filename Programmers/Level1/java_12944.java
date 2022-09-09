package algorithm2.Programmers.Level1;

import java.text.DecimalFormat;

public class java_12944 {
    // 프로그래머스 레벨1 평균 구하기

    public static void main(String[] args) {
        int[] arr = {5,5};
        double answer = 0;

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        DecimalFormat dr = new DecimalFormat("#.#");
        answer = (double) sum / arr.length;

        System.out.println(dr.format(answer));
    }
}
