package algorithm2.Programmers.Level1;

import java.util.*;

public class java_12906 {
    // 프로그래머스 레벨1 같은 숫자는 싫어
    
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++) {

            if (stack.empty()) stack.push(arr[i]);
            else if(stack.peek() != arr[i]) stack.push(arr[i]); 

        }

        int[] answer = new int[stack.size()];
        for(int i=0; i<stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        System.out.println(Arrays.toString(answer));

    }
}
