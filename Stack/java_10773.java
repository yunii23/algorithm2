package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_10773 {
    public static int[] stack;
    public static int size = 0;
    public static int sum = 0;
    // 백준 스택 제로 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        stack = new int[k];

        while(k-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if(n > 0) {
                push(n);
            }
            else {
                pop();
            }

        }

        for(int i=0; i<stack.length; i++) {
            sum+= stack[i];
        }

        System.out.println(sum);
    }

    public static void push(int n) {
        stack[size] = n;
        size++;
    }

    public static void pop() {
        stack[size-1] = 0;
        size--;
    }
}
