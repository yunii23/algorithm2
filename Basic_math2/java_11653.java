package algorithm2.Basic_math2;

import java.util.Scanner;

//백준 기본수학2 소인수분해
//참고 https://st-lab.tistory.com/152
public class java_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=2; i<=n; i++) {
            while(n % i == 0) {
                n /= i;
                System.out.println(i);
            }
        }

        

        sc.close();
    }
}
