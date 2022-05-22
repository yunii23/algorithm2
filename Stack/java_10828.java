package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class java_10828 {
    // 백준 스택 10828

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = br.readLine();
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            if(arr[i].contains("push")) {
                StringTokenizer st = new StringTokenizer(arr[i]);
                String s1 = st.nextToken();
                int s2 = Integer.parseInt(st.nextToken());

                stack.push(s2);
            }
            else if(arr[i].equals("pop")) {
                if(stack.empty()) {
                    sb.append(-1).append("\n");
                }else {
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                }
            }
            else if(arr[i].equals("top")) {
                if(stack.empty()) {
                    sb.append(-1).append("\n");
                }else {
                    sb.append(stack.peek()).append("\n");
                }
            }
            else if(arr[i].equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if(arr[i].equals("empty")) {
                if(stack.empty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }

            System.out.println(sb);
            
        }

        
    }
}
