package algorithm2.Basic_math2;

import java.util.Scanner;

//백준 기본수학2 골드바흐의 추측
//참고 https://st-lab.tistory.com/91
public class java_9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        //n을 절반으로 나눠서 검사
        //n = p + q 일 때, p와 q가 소수가 아니면 p-1, q+1 해서 소수일 때 까지 찾음
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int p = n/2;
            int q = n/2;

            get_prime(n);

            for(int j=0; j<n/2; j++) {
                if(prime[p] == false && prime[q] == false) {
                    System.out.println(p + " " + q);
                    break;
                }
                p--;
                q++;
                
            }

        }

        sc.close();
    }


    public static void get_prime(int n) {
        prime[0] = prime[1] = true;

        for(int i=2; i<n; i++) {
            if(prime[i] == true) {
                continue;
            }

            for(int j=i*i; j<n; j+=i) {
                prime[j] = true;
            }
        }
    }
}
