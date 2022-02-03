package algorithm2.Onedimensional_arrangement;

import java.util.*;

//백준 1차원 배열 최댓값
public class java_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        int index = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= max) {
                max = arr[i];
                index = i;
            }
        }
        
        System.out.print(max + " " + (index+1));
        //System.out.print(index);

        sc.close();
    }
}
