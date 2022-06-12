package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_4949 {
    // 백준 스택 균형잡힌 세상

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();        
            
            if(s.equals(".")) break;

            sb.append(solve(s)).append("\n");
                    
        }

        System.out.println(sb);
    }
    

    public static String solve(String s) {

        char[] stack = new char[s.length()];
        int size = 0;

        for(char val : s.toCharArray()) {

            if (val == '(' || val == '[') {
				stack[size] = val;
				size++;
			}

            else if (val == ')') {
				
				// 요소가 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우 
				if (size == 0 || stack[size - 1] != '(') {
					return "no";
				} 
				else {
					size--;
				}
			} 

            else if (val == ']') {
				
				// 요소가 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우 
				if (size == 0 || stack[size - 1] != '[') {
					return "no";
				} 
				else {
					size--;
				}
			}
        }

        if (size != 0) {
			return "no";
		} 
		else {
			return "yes";
		}
    }










    // public static char[] stack = new char[100];
    // public static int size = 0;

    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st;
    //     StringBuilder sb = new StringBuilder();

    //     while(true) {
    //         String s = br.readLine();

    //         if(s.equals(".")) break;

    //         else {
    //             st = new StringTokenizer(s, " ");
                
    //             while(st.hasMoreTokens()) {
    //                 String token = st.nextToken();
    //                 if(token.contains("(") || token.contains("[") || token.contains(")") || token.contains("]")) {
    //                     check(token);
    //                 }
    //             }

    //             if(size != 0) {
    //                 sb.append("no").append("\n");
    //                 size = 0;
    //             }
    //             else sb.append("yes").append("\n");
    //         }             
    //     }

    //     System.out.println(sb);
    // }


    // public static void check(String token) {
    //     int i = 0;

    //     while(i < token.length()) {
    //         char c = token.charAt(i);

    //         if(c == '(' || c == '[') {
    //             push(c);
    //         }
    //         else if(c == ')') {
    //             pop1();
    //         }
    //         else if(c == ']') {
    //             pop2();
    //         }

    //         i++;
    //     }
    // }


    // public static void push(char c) {
    //     stack[size] = c;
    //     size++;
    // }

    // public static void pop1() {   
    //     if(size == 0) {
    //         size ++;
    //     } 
    //     else {
    //         if(stack[size-1] == '(') {
    //             stack[size-1] = 0;
    //             size--;
    //         } else {
    //             size ++;
    //         }
    //     }
    // }

    // public static void pop2() {   
    //     if(size == 0) {
    //         size ++;
    //     } 
    //     else {

    //         if(stack[size-1] == '[') {
    //             stack[size-1] = 0;
    //             size--;
    //         } else {
    //             size ++;
    //         }
    //     }
    // }

    
}
