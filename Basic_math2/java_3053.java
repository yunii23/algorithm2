package algorithm2.Basic_math2;

import java.util.Scanner;

//백준 기본수학2 택시 기하학
public class java_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.println(String.format("%.6f", Math.PI*r*r));
        System.out.println(String.format("%.6f", 2.0*r*r));

        sc.close();
    }
}
