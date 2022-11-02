package algorithm2.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 그리디 알고리즘 ATM
public class java_11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] time = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sum = arr[0];
        time[0] = arr[0];
        for(int i=1; i<n; i++) {
            time[i] = arr[i] + time[i-1];
            sum += time[i];
        }
        System.out.println(Arrays.toString(time));
        System.out.println(sum);
    }
}
