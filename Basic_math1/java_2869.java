package algorithm2.Basic_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학1 달팽이는 올라가고 싶다
//참고 https://drcode-devblog.tistory.com/176
public class java_2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()); //낮에 올라갈 수 있는 미터
        int b = Integer.parseInt(st.nextToken()); //자는 동안 미끄러지는 미터
        int v = Integer.parseInt(st.nextToken()); //나무 높이

        // ax - b(x-1) = v     b는 무조건 a보다 1작음
        // ax - bx + b = v
        // (a-b)x + b = v
        // (a-b)x = v-b
        // x = v-b / a-b

        int day = (v - b) / (a - b);

        if(((v - b) % (a - b)) != 0) {
            day++;
        }

        System.out.print(day);


        //시간 초과 문제때문에 코드 수정

        // int sum = 0; //올라갔다 내려간 정도
        // int day = 1;

        // while(true) {

        //     sum += a;

        //     if(v <= sum) {
        //         System.out.print(day);
        //         break;
        //     }

        //     sum -= b;

        //     day++;
        // }

    }
}
