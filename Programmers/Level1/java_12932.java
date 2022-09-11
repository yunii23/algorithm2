package algorithm2.Programmers.Level1;

import java.util.*;

public class java_12932 {
    // 프로그래머스 레벨1 자연수 뒤집어 배열로 만들기
    
    public static void main(String[] args) {
        long n = 12345;

        String s = Long.toString(n);     
        int[] answer = new int[s.length()];
        //String[] arr = s.split("");
        
        int i = 0;
        while(n != 0) {
            answer[i] = (int) (n % 10);
            n /= 10;
            i++;
        }
        
        System.out.println(Arrays.toString(answer));
    }
}
