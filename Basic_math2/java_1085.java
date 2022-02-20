package algorithm2.Basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학2 직사각형에서 탈출
public class java_1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];

        for(int i=0; i<4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arr[4] = arr[3] - arr[1];
        arr[5] = arr[2] - arr[0];
        
        int min = 1000;
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
