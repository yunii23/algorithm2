package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Stack;
import java.util.StringTokenizer;

public class java_10828 {
    // 백준 스택 10828

    public static int[] stack;
    public static int size = 0; // -> 요소의 개수 (size), size는 배열의 크기가 아니라 데이터의 개수를 의미함

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        stack = new int[n];

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(pop()).append('\n');
                    break;

                case "size" :
                    sb.append(size()).append('\n');
                    break;

                case "empty" :
                    sb.append(empty()).append('\n');
                    break;

                case "top" :
                    sb.append(top()).append('\n'); 
                    break;  
            }
        }

        System.out.println(sb);
    }

    public static void push(int n) {

        stack[size] = n;
        size++;
    }


    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[size-1];
            stack[size-1] = 0;
            size--;
            return res;
        }
    }


    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }


    public static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size-1];
        }
    }

    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());

    //     String[] arr = new String[n];

    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = br.readLine();
    //     }

    //     Stack<Integer> stack = new Stack<>();
    //     StringBuilder sb = new StringBuilder();

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i].contains("push")) {
    //             StringTokenizer st = new StringTokenizer(arr[i]);
    //             String s1 = st.nextToken();
    //             int s2 = Integer.parseInt(st.nextToken());

    //             stack.push(s2);
    //         } else if (arr[i].equals("pop")) {
    //             if (stack.empty()) {
    //                 sb.append(-1).append("\n");
    //             } else {
    //                 sb.append(stack.peek()).append("\n");
    //                 stack.pop();
    //             }
    //         } else if (arr[i].equals("top")) {
    //             if (stack.empty()) {
    //                 sb.append(-1).append("\n");
    //             } else {
    //                 sb.append(stack.peek()).append("\n");
    //             }
    //         } else if (arr[i].equals("size")) {
    //             sb.append(stack.size()).append("\n");
    //         } else if (arr[i].equals("empty")) {
    //             if (stack.empty())
    //                 sb.append(1).append("\n");
    //             else
    //                 sb.append(0).append("\n");
    //         }

    //     }

    // }
}
