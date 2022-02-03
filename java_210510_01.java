package algorithm2;

import java.util.Scanner;

/**
 * java_210510_01
 */
public class java_210510_01 {
    // 재귀 팩토리얼
    static int n;
    static int value=1;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        System.out.println(result(n));
        sc.close();
    }

    public static int result(int n){
        if(n <= 1) {
            return 1;
        } 

        return n*result(n-1);
    }


}