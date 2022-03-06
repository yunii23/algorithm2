package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 정렬 나이순 정렬
//참고 https://st-lab.tistory.com/113?category=857114
public class java_10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = st.nextToken();
            }
        }


        Arrays.sort(arr, (o1, o2) -> {
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
