package algorithm2.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_2447_2 {
    // 백준 재귀 2447 다시 풀기

    
    public static char[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        StringBuilder sb = new StringBuilder();
        star(0, 0, n, false);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void star(int x, int y, int n, boolean blank) {
        
        //공백칸일 경우
        if(blank) {
            
        }

        return;
    }
}
