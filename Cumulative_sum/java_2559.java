package algorithm2.Cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 누적합 수열
public class java_2559 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] sum = new int[n];
        Arrays.fill(sum, -100 * n - 1); 

        int j = 0;
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            result += arr[i];
            //System.out.println(result);

            if(i >= k-1) {
                sum[j] = result;
                result -= arr[j];
                j++;
            }
        }

        Arrays.sort(sum);
        System.out.println(sum[n-1]);
    }
}
