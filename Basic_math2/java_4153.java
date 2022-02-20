package algorithm2.Basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학2 직각삼각형
//참고https://st-lab.tistory.com/88
//a b c가 명확하게 정해지지 않았으므로 각 경우를 다 따져야함
public class java_4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            if(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c) {
                System.out.println("right");
            }

            else if(Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2)) == b) {
                System.out.println("right");
            }

            else if(Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)) == a) {
                System.out.println("right");
            }

             else {
                System.out.println("wrong");
            }
        }
    }
}
