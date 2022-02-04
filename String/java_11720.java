package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 숫자의 합
public class java_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.println(1);
        } else {
            String s = br.readLine();

            String[] arr = s.split("");
            int[] num = new int[arr.length];
            int sum = 0;

            for(int i=0; i<arr.length; i++) {
                num[i] = Integer.parseInt(arr[i]);
                sum += num[i];
            }
            System.out.println(sum);
            

        }


    }
}
