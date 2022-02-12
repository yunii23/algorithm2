package algorithm2.Basic_math1;

import java.util.Scanner;

//백준 기본수학1 설탕 배달
public class java_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int threeMax, fiveMax;
        int min = 1667;

        if(n == 4) {
            System.out.println(-1);
        }


        else {
            if(n%3 == 0) {
                threeMax = (n / 3);
            }else {
                threeMax = (n / 3) + 1;
            }

            if(n%5 == 0) {
                fiveMax = (n / 5);
            }else {
                fiveMax = (n / 5) + 1;
            }


            for(int i=0; i<=threeMax; i++) {
                for(int j=0; j<=fiveMax; j++) {

                    if(n == ((3*i) + (5*j))) {
                        if(min > i+j) {
                            min = i+j;
                        }
                    }
                }
            }

            if(min == 1667) {
                System.out.println(-1);
            }else {
                System.out.println(min);
            }
        }


        sc.close();
    }
}
