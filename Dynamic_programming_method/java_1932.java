package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 동적계획법1 정수삼각형
// https://st-lab.tistory.com/131
public class java_1932 {

    static int[][] arr;
    static Integer[][] dp;
    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        dp = new Integer[n][n];
        
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<i+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            dp[n-1][i] = arr[n-1][i];
        }

        System.out.println(find(0, 0));
    }

    static int find(int depth, int idx) {

        // 마지막 행일 경우 현재 위치의 dp값 반환
        if(depth == n-1) return dp[depth][idx];

        // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
        if(dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + arr[depth][idx]; 
        }

        return dp[depth][idx];
    }
}
