package algorithm2.Recursive;

import java.util.Scanner;

//백준 재귀 팩토리얼
public class java_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
        
        
        sc.close();
    }

    public static int factorial(int n) {

        //종료조건
        if(n == 1) {
            return n;
        }

        //예외
        if(n == 0) {
            return 1;
        }

        return n*factorial(n-1);

    }
}
