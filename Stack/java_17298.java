package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java_17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        
        int i = n-1;
        while(i >= 0) {
            int num = Integer.parseInt(input[i]);

            while(!stack.empty() && (num >= stack.peek())) {
                stack.pop();
            }
        }

    }
}
