package algorithm2.Onedimensional_arrangement;

import java.util.*;

//백준 1차원 배열 최소, 최대
public class java_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        //int max = -999999;
        //int min = 999999;
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        /* 에러나서 다른 방법으로
        for(int i=0; i<n; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
            if(arr[i] <= min) {
                min = arr[i];
            }
        }
        
        System.out.println(min + " " + max);
        */
        
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);

        sc.close();
    }
}
