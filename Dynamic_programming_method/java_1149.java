package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 동적계획법1 RGB 거리
public class java_1149 {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        cost = new int[n][3];
        dp = new int[n][3];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            cost[i][Red] = Integer.parseInt(st.nextToken());
            cost[i][Green] = Integer.parseInt(st.nextToken());
            cost[i][Blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];

        System.out.println(Math.min(Paint_cost(n-1, Red), Math.min(Paint_cost(n-1, Green), Paint_cost(n-1, Blue))));
    }

    public static int Paint_cost(int n, int color) {
        
        // 만약 탐색하지 않은 배열이라면
        if(dp[n][color] == 0) {
            
            //color의 색에 따라 이전 집의 서로 다른 색을 재귀 호출하여 최솟값과 현재 집의 비용을 더해서 dp에 저장
            if(color == Red) {
                dp[n][Red] = Math.min(Paint_cost(n-1, Green), Paint_cost(n-1, Blue)) + cost[n][Red];
            }
            else if(color == Green) {
                dp[n][Green] = Math.min(Paint_cost(n-1, Red), Paint_cost(n-1, Blue)) + cost[n][Green];
            }
            else if(color == Blue) {
                dp[n][Blue] = Math.min(Paint_cost(n-1, Red), Paint_cost(n-1, Green)) + cost[n][Blue];
            }
        }

        return dp[n][color];
    }
}
