package algorithm2.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_18258 {
    // 백준 큐2

    public static int[] queue;
    static int size = 0;
    static int front = 0;
    static int back = -1;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        queue = new int[n];
        StringTokenizer st;

        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push": 
                    int i = Integer.parseInt(st.nextToken());
                    push(i);
                    break;

                case "pop":
                    pop();
                    break;

                case "size":
                    Size();
                    break;

                case "empty":
                    empty();
                    break;

                case "front":
                    Front();
                    break;

                case "back":
                    Back();
                    break;
            }

        }

        System.out.println(sb);
    }

    public static void push(int i) {
        size ++;
        back ++;
        queue[back] = i;
    }

    public static void pop() {
        if(size == 0) {
            sb.append(-1).append("\n");
            return;
        }
        sb.append(queue[front]).append("\n");
        queue[front] = 0;
        front ++;
        size --;
    }

    public static void Size() {
        sb.append(size).append("\n");
    }

    public static void empty() {
        if(size == 0) {
            sb.append(1).append("\n");
        }
        else {
            sb.append(0).append("\n");
        }
    }

    public static void Front() {
        if(size == 0) {
            sb.append(-1).append("\n");
        }
        else {
            sb.append(queue[front]).append("\n");
        }
    }

    public static void Back() {
        if(size == 0) {
            sb.append(-1).append("\n");
        }
        else {
            sb.append(queue[back]).append("\n");
        }
    }
}
