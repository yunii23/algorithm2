package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 동적계획법1 알고리즘 수업 - 피보나치 수1
//https://velog.io/@maxxyoung/%EB%B0%B1%EC%A4%80-24416-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%ED%94%BC%EB%B3%B4%EB%82%98%EC%B9%98-%EC%88%98-1
public class java_24416 {

    static int count1 = 0;
    static int count2 = 0;
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int[n];

        fib(n);
        fibonacci(n);
        System.out.print(count1 + " ");
        System.out.println(count2);
    }

    public static int fib(int n) {
        
        if(n == 1 || n == 2) {
            count1 ++;
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }


    public static int fibonacci(int n) {
        
        memo[0] = 1;
        memo[1] = 1;

        for(int i=2; i<n; i++){
            count2++;
            memo[i] = memo[i-2] + memo[i-1];
        }

        return memo[n-1];
    }


}
