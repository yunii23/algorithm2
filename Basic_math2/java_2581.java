package algorithm2.Basic_math2;

import java.util.ArrayList;
import java.util.Scanner;

//백준 기본수학2 소수
public class java_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=m; i<=n; i++) {
            int count = 0;
            for(int j=1; j<=i; j++) {
                if(i % j == 0)  {
                    count++;
                }
            }

            if(count == 2) {
                arr.add(i);
            }
        }

        if(arr.size() == 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for(int i=0; i<arr.size(); i++) {
                sum += arr.get(i);
            }
            System.out.println(sum);
            System.out.println(arr.get(0));
        }

        sc.close();
    }
    
}
