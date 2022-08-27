package algorithm2.Integer_and_Combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class java_1037 {
    // 백준 약수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());
        int[] arr = new int[value];

        StringTokenizer st;

        if(value == 1) {
            arr[0] = Integer.parseInt(br.readLine());
            System.out.println(arr[0] * arr[0]);
        } 
        else {
            st = new StringTokenizer(br.readLine());
            
            for(int i=0; i<value; i++) {
                
                arr[i] = Integer.parseInt(st.nextToken());    
            }

            Arrays.sort(arr);
            System.out.println(arr[0] * arr[value-1]);
        }
        
    }
}
