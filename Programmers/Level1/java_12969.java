package algorithm2.Programmers.Level1;

import java.util.Scanner;

public class java_12969 {
    // 프로그래머스 레벨1 직사각형 별찍기

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++) {
            for(int j=0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
