package algorithm2.Programmers.Level1;

import java.text.DecimalFormat;

public class java_12934 {
    // 프로그래머스 레벨1 정수 제곱근 판별

    public static void main(String[] args) {
        long n = 121;
        long answer = 0;

        DecimalFormat df = new DecimalFormat("#.####");
        String s = df.format(Math.sqrt(n));

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '.') {
                answer = -1;
                break;
            }
        }

        if(answer == 0) {
            answer = (long) Math.pow(Double.parseDouble(s)+1, 2);
        }

        System.out.println(answer);
    }
}
