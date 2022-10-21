package algorithm2.Dynamic_programming_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 동적계획법1 파도반 수열
public class java_9461 {

    static long[] arr = new long[101];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());

            System.out.println(half_wave(n));
        }
    }

    public static long half_wave(int n) {

        if(arr[n] == 0) {
            arr[n] = (long) (half_wave(n-2) + half_wave(n-3));
        }
        
        return arr[n];
    }
}
