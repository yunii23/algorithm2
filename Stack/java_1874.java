package algorithm2.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java_1874 {
    // 백준 스택 스택수열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int start = 0;

        while (n-- > 0) {
            // n번 반복
            int value = Integer.parseInt(br.readLine());

            // 1 ~ 첫번째 수열 입력값까지 push
            if (value > start) {
                //System.out.println("들어옴1");
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                // push는 오름차순이어야 하기 때문에 어디까지 push 했는지 알기 위해 start 변수 값 변경
                start = value;
            }

            // top이 입력값과 같지 않을 경우
            else if (stack.peek() != value) {
                //System.out.println("들어옴2");
                System.out.println("NO");
                return; // 종료
            }

            // value 까지 push 되었다면 pop
            //System.out.println("들어옴3");
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
