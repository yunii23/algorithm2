package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 동적계획법1 신나는 함수 실행
public class java_9184 {
    static int[][][] memo = new int[21][21][21];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 종료조건
            if(a == b && b == c && a == -1) {
                break;
            }

            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));

        }
    }

    public static int w(int a, int b, int c) {

        memo[0][0][0] = 1;

        // if(memo[a][b][c] > 0) {
        //     return memo[a][b][c];
        // }

        if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        
        else if(a > 20 || b > 20 || c > 20) {

            if(memo[20][20][20] > 0) {
                return memo[20][20][20];
            }

            memo[20][20][20] = w(20, 20, 20);
            return w(20, 20, 20);
        }

        else if(a < b && b < c) {

            if(memo[a][b][c] > 0) {
                return memo[a][b][c];
            }

            memo[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }

        if(memo[a][b][c] > 0) {
            return memo[a][b][c];
        }

        memo[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);

        return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);

    }
}
