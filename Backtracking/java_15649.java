package algorithm2.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 백트래킹 n과 m 1
public class java_15649 {
    //https://st-lab.tistory.com/114

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];

        dfs(n, m, 0);
        System.out.println(sb);
    }

    public static void dfs(int n, int m, int dp) {

        // 재귀 깊이가 m과 같아지면 탐색 과정에서 담았던 배열 출력
        if(dp == m) {
            for(int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++) {
            
            // 해당 노드(값)을 방문하지 않았다면
            if(visit[i] == false) {
                visit[i] = true; // 해당 노드를 방문 상태로 변경
                arr[dp] = i+1; // 해당 깊이를 index로 하여 i+1 값 저장
                dfs(n, m, dp+1); // 다음 자식 노드 방문을 위해 dp 1 증가시키면서 재귀호출

                // 자식 노드 방문이 끝나고 돌아오면 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }

        return;

    }

}
