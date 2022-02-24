package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 브루트포스 분해합
//참고 https://st-lab.tistory.com/98
public class java_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<n; i++) {

            int number = i;
            int sum = 0; //합

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            } 
        }

        System.out.println(result);

    }
}
