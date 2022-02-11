package algorithm2.Basic_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본 수학1 ACM 호텔
//n과 h가 같을 때의 경우 부분 참고 https://st-lab.tistory.com/77?category=841870
public class java_10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            //int w = Integer.parseInt(st.nextToken()); 굳이 필요없음
            int n = Integer.parseInt(st.nextToken());

            if(n % h == 0) {
                System.out.println((h * 100) + (n/h));
            }else {
                System.out.println(((n%h) * 100) + (n/h) + 1);
            }
        }

    }
}
