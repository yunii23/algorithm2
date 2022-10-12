package algorithm2.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 백트래킹 n과 m 2
//https://st-lab.tistory.com/115
public class java_15650 {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int n, m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        dfs(0, 0);
        System.out.println(sb);

    }

    public static void dfs(int dp, int at) {

        if(dp == m) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=at; i<n; i++) {

            arr[dp] = i+1;
            dfs(dp+1, i+1);

        }

        return;
    }
}
