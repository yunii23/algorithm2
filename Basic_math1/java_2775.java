package algorithm2.Basic_math1;

import java.util.Scanner;

//백준 기본수학1 부녀회장이 될테야
public class java_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] zero = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        for(int i=0; i<t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;
            int[] oneMin = new int[14];

            if(k == 1) {
                for(int j=0; j<n; j++) {
                    sum += zero[j];
                }
                System.out.println(sum);
            }
            

            else { //k가 2층 이상일 때

                // 1층 값 n까지 계산
                for(int j=0; j<n; j++) {
                    sum += zero[j];
                    oneMin[j] = sum;
                }

                // 
                for(int j=0; j<k-1; j++) {
                    for(int l=1; l<n; l++) {
                        oneMin[l] =  oneMin[l-1] + oneMin[l];
                    } 
                }

                System.out.println(oneMin[n-1]);
            }
        }

        sc.close();
    }
}
