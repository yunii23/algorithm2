package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class java_9012 {
    //백준 스택 괄호
    public static char[] stack = new char[50];
    public static int size = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(t-- > 0) {

            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int leng = s.length();

            for(int i=0; i<leng; i++) {
                if(size < 0) {
                    break;
                }
                char c = s.charAt(i);
                switch (c) {
                    case '(':
                        push(c);
                        break;
                
                    case ')':
                        pop();
                        break;
                }
            }

            if(size != 0) {
                sb.append("NO").append("\n");
                size = 0;
            }
            else sb.append("YES").append("\n");

            Arrays.fill(stack, ' ');
        }

        System.out.println(sb);
    }


    public static void push(char c) {
        stack[size] = c;
        size++;
    }

    public static void pop() {

        if(size <= 0) {
            size--;
        }
        else {
            stack[size-1] = 0;
            size--;
        }
        
    }
}
