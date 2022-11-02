package algorithm2.Programmers.Level1;

import java.util.Stack;

//프로그래머스 레벨1 햄버거 만들기
public class java_133502 {

    static Stack<Integer> stack = new Stack<>();
    static int answer = 0;

    public static void main(String[] args) {
        //int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        //int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        //int[] ingredient = {1, 1, 2, 3, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1, 1};
        int[] ingredient = {1, 2, 2, 3, 1};

        // 빵 - 야채 - 고기 - 빵 
        // 1 - 2 - 3 - 1

        for(int i=0; i<ingredient.length; i++) {
            stack.push(ingredient[i]);

            if(stack.peek() == 1) {
                lastBread();
            }
        }

        System.out.println(answer);
    }

    public static void firstBread() {
        stack.pop();
        
        // if(stack.isEmpty()) {
        //     stack.push(1);
        //     return;
        // }

        answer ++;
    }

    public static void vegetable() {
        stack.pop();
        
        if(stack.isEmpty()) {
            stack.push(2);
            return;
        }
        if(stack.peek() == 1) {
            firstBread();
        }
        else {
            stack.push(2);
        }
    }

    public static void meat() {
        stack.pop();
        
        if(stack.isEmpty()) {
            stack.push(3);
            return;
        }
        if(stack.peek() == 2) {
            vegetable();
        }
        else {
            stack.push(3);
        }
    }

    public static void lastBread() {
        //int temp = stack.peek();

        stack.pop();
        
        if(stack.isEmpty()) {
            stack.push(1);
            return;
        }
        if(stack.peek() == 3) {
            meat();
        }
        else {
            stack.push(1);
        }
    }
}
