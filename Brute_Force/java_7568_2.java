package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_7568_2 {
    // 백준 브루트포스 덩치 다시 풀기

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = n;
        }

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {

                // 키와 몸무게가 첫번째 비교자가 더 클 때
                if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) arr[i][2]--;
                
                // 둘 중 우열을 가릴 수 없을 때 -> 몸무게는 크고, 키는 작고
                else if (arr[i][0] >= arr[j][0] && arr[i][1] <= arr[j][1]) {
                    arr[i][2]--;
                    arr[j][2]--;
                }

                // -> 몸무게는 작고, 키는 크고
                else if (arr[i][0] <= arr[j][0] && arr[i][1] >= arr[j][1]) {
                    arr[i][2]--;
                    arr[j][2]--;
                }

                // 두번째 비교자가 더 클 때
                else arr[j][2]--;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i][2] + " ");
        }
    }
}
