package algorithm2.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class java_2164 {
    //백준 큐 카드2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            queue.offer(i);
        }

        int i = 0;
        while(true) {

            if(queue.size() == 1) break;

            else {

                // 짝수일때 버리기
                if(i % 2 == 0) {
                    queue.remove();
                }
                // 홀수일때 제일 아래로
                else {
                    queue.offer(queue.peek());
                    queue.remove();
                }
                i++;
            }
        }

        System.out.println(queue.peek());
    }
}
