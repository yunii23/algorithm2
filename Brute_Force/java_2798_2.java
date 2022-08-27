package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_2798_2 {
    // 백준 블랙잭 다시 풀기

    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(blackJack(n, m));

    }

    public static int blackJack(int n, int m) {

        int sum = 0;
        int result = 0;

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {

                    sum = arr[i] + arr[j] + arr[k];
                    if(sum == m) {                  
                        return sum;
                    }
                    if(sum < m && result < sum) result = arr[i] + arr[j] + arr[k];         
                }
            }
        }

        return result;
    }
}
