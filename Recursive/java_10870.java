package algorithm2.Recursive;

import java.util.Scanner;

//백준 재귀 피보나치 수 5
public class java_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }


    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        
        else if(n == 1) {
            return 1;
        }
        
        //2부터
        else {
            return sum(n-2) + sum(n-1);
        }
    }
}
