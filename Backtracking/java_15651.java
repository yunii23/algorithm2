package algorithm2.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 백트래킹 n과 m 3
public class java_15651 {

    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int dp) {
        
        if(dp == m) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<n; i++) {
            arr[dp] = i+1;
            dfs(dp+1);
        }
    }
}
