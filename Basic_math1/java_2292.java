package algorithm2.Basic_math1;

import java.util.Scanner;

//백준 기본수학1 벌집
public class java_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 1;
        int i = 1;

        while(true) {
            if(max >= n) {
                System.out.print(i);
                break;
            }

            max = max + (6 * i);
            i ++;
        }

        sc.close();
    }
}
