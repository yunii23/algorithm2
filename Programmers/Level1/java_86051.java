package algorithm2.Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class java_86051 {
    // 프로그래머스 레벨1 없는 숫자 더하기

    public static void main(String[] args) {
        //int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers = {5,8,4,0,6,7,9};
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
            list.add(numbers[i]);
        }

        for(int i=0; i<10; i++) {
            if(!list.contains(i)) answer += i;
        }

        System.out.println(answer);
    }
}
