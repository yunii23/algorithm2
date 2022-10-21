package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 동적 계획법1 연속합
//https://st-lab.tistory.com/140
public class java_1912 {
    static int[] arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /*
		 * dp[0]은 첫 원소로 이전에 더이상 탐색할 것이 없기 때문에
		 * arr[0] 자체 값이 되므로 arr[0]으로 초기화 해준다.
		 * max또한 첫 번째 원소로 초기화 해준다.
		 */

        dp[0] = arr[0];
        max = arr[0];

        // dp의 마지막 index는 n-1이므로 n-1부터 top-down
        recur(n-1);

        System.out.println(max);

    }

    public static int recur(int n) {

        // 탐색하지 않은 인덱스라면
        if(dp[n] == null) {

            // 이전 배열의 누적합 + 현재 값 과 현재 값을 비교하여 최댓값을 n 위치에 저장
            dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);

            // 해당 dp[n]과 max 중 큰 값으로 max 갱신
            max = Math.max(dp[n], max);
        }

        return dp[n];
    }



    // static int[] arr;
    // static int max = -2147483648;

    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int n = Integer.parseInt(br.readLine());
    //     arr = new int[n];

    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     for(int i=0; i<n; i++) {
    //         arr[i] = Integer.parseInt(st.nextToken());
    //     }

    //     for(int i=0; i<arr.length; i++) {
    //         sum(i, n);
    //     }

    //     System.out.println(max);
    // }

    // public static void sum (int i, int n) {

    //     int result = 0;
    //     for(int j=i; j<n; j++) {
    //         result += arr[j];

    //         if(result > max) {
    //             max = result;
    //         }   
    //     }
    // }
}
