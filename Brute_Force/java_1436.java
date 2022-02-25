package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 브루트포스 영화감독 숌
//참고 https://st-lab.tistory.com/103
public class java_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 666;

        if(n == 1) {
            System.out.println(666);
        }
        else {
            while(true) {
            
                String s = Integer.toString(sum);
                if(s.contains("666")) {
                    count++;
                }
                if(count == n) {
                    System.out.println(sum);
                    break;
                } 

                sum++;
            }
        }
        
    }
}
