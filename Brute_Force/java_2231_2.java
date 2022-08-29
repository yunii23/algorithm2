package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_2231_2 {
    // 백준 분해합 다시 풀기

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++) {
            int sum = i;
            int k = i;
            
            while(true) {
                System.out.println("확인1 " + sum + " " + k);
                sum += k % 10;
                k /= 10;
                System.out.println("확인2 " + sum + " " + k);

                if(k == 0) break;
            }

            if(sum == n) {
                System.out.println(i);
                break;
            } 

            if(i == n && sum != n) {
                System.out.println(0);
            }
        }



    }


}
