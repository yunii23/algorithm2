package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_4949 {
    // 백준 스택 균형잡힌 세상
    public static char[] stack = new char[100];
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();

            if(s.equals(".")) break;

            else {
                st = new StringTokenizer(s, " ");
                
                while(st.hasMoreTokens()) {
                    String token = st.nextToken();
                    if(token.contains("(")) {
                        push(token);
                    }
                    else if(token.contains(")")) {
                        pop();
                    }
                    else if(token.contains("[")) {
                        push(token);
                    }
                    else if(token.contains("]")) {
                        pop();
                    }
                }

            }   
            
        }
    }

    public static void push(String token) {
        int i = 0;
        while(i < token.length()) {


        }
        // stack[size] = ;
        // size++;
    }

    public static void pop() {
        stack[size-1] = 0;
        size--;
    }
}
