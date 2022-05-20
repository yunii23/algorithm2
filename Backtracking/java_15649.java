package algorithm2.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 백트래킹 n과 m 1
public class java_15649 {
    // 이미 방문한 노드라면 다음 노드를 탐색하도록 하기 위해 
    // n크기의 boolean 배열을 생성
    // 방문한게 true 하지 않은게 false
    public static boolean[] visit;

    //탐색 과정에서 값을 담을 int 배열 arr 생성
    public static int[] arr;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0);
        System.out.println(sb);


    }


    public static void dfs(int n, int m, int dp) {

        // 재귀 길이가 m과 같아지면 탐색 과정에서 담았던 배열 출력
        if(dp == m) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }

            sb.append("\n");
            return;
        }


        for(int i=0; i<n; i++) {

            //만약 해당 노드(값)를 방문하지 않았다면
            if(visit[i] == false) {

                visit[i] = true; //해당 노드를 방문상태로 변경
                arr[dp] = i + 1; //해당 깊이를 index로 하여 i+1 값 저장
                dfs(n, m, dp + 1); //다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀 호출

                // 자식 노드 방문이 끝나고 돌아오면 방문 노드를 방문하지 않은 상태로 변경
                visit[i] = false;
            }
        }

        return;
    }
}
