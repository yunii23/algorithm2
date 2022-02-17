package algorithm2.Basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학2 소수찾기
//참고 https://hyunipad.tistory.com/66
public class java_1978 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            int count = 0;

            for(int j=1; j<=num; j++) {
                if(num % j == 0) {
                    count ++;
                }
            }

            if(count == 2) {
                sum++;
            }


        }
        System.out.println(sum);
        
    }
}
