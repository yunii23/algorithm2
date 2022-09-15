package algorithm2.Programmers.Level1;

import java.util.StringTokenizer;

public class java_12930 {
    // 프로그래머스 레벨1 이상한 문자 만들기

    public static void main(String[] args) {
        
        String s = "hello  world";

        String answer = "";

        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            String[] arr = st.nextToken().split("");

            for(int i=0; i<arr.length; i++) {
                
                if(i % 2 == 0) {
                    arr[i] = arr[i].toUpperCase();
                    answer += arr[i];
                }
                else {
                    arr[i] = arr[i].toLowerCase();
                    answer += arr[i];
                    
                }
            }    
            answer += " ";
        }

        answer = answer.trim();

        System.out.println(answer);
    }
}
