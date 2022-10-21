package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 동적계획법1 01타일

// n = 1 -> 1                                                                                                      => 개수 1
// n = 2 -> 11, 00                                                                                                 => 개수 2
// n = 3 -> 111, 100, 001                                                                                          => 개수 3
// n = 4 -> 1111, 1100, 1001, 0011, 0000                                                                           => 개수 5
// n = 5 -> 11111, 11100, 11001, 10011, 00111, 10000, 00100, 00001                                                 => 개수 8
// n = 6 -> 111111, 111100, 111001, 110011, 100111, 001111, 110000, 100100, 001100, 001001, 000011, 100001, 000000 => 개수 13

// 피보나치 수 처럼 증가하는 것 확인할 수 있음
// f(n) = f(n-1) + f(n-2);

public class java_1904 {
    static int[] memo;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        memo = new int[1000001];

        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;

        for(int i=3; i<memo.length; i++) {
            memo[i] = -1;
        }

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        

        if(memo[n] == -1) {
            memo[n] = (fib(n-1) + fib(n-2)) % 15746;
        }
        

        return memo[n];

    }






    // // 시간초과

    // static int n;
    // static int[] arr;
    // static int count = 0;
    // //static boolean[] visit = new boolean[2];
    // static StringBuilder sb = new StringBuilder();
    
    // public static void main(String[] args) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     n = Integer.parseInt(br.readLine());

    //     arr = new int[n];

    //     dfs(n-1);
    //     System.out.println(count);
    //     System.out.println(sb);
    // }

    // public static void dfs(int dp) {
    //     // 종료
    //     if(dp < 0) {
    //         int sum = 0; // 0 개수 체크
    //         int check = 0; // 0이 연속되게 나오는지 체크 -> 0보다 크면 연속
    //         int one = 0; // 마지막 1만 나오는 것 체크

    //         // 0이 짝수 ?
    //         for(int i=n-1; i>=0; i--) {
    //             if(arr[i] == 0) {
    //                 sum ++;
    //             }
    //             sb.append(arr[i]).append(" ");
                
    //             if(arr[i] == 1) {
    //                 one ++;
    //             }
    //         }

    //         for(int i=n-1; i>0; i--) {
    //             if(arr[i] == arr[i-1] && arr[i] == 0) {
    //                 check++;
    //             }
    //         } 

    //         if(check > 0 && sum % 2 == 0) {
    //             sb.append("\n");
    //             count++;
    //         } 
    //         else if(check == 0 && sum % 2 == 0 && one == 4) {
    //             count++;
    //         }

    //         // for(int i=n-1; i>=0; i--) {
    //         //     sb.append(arr[i]).append(" ");
    //         // }

    //         sb.append("\n");
    //         return;
    //     }

    //     for(int i=0; i<2; i++) {
    //         arr[dp] = i;
    //         dfs(dp-1);
    //     }

    // }
}
