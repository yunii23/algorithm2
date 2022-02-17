package algorithm2.Basic_math2;

import java.util.Scanner;

//백준 기본수학2 베르트랑 공준
public class java_4948 {

    public static boolean prime[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0)
                break;

            if (n == 1) {
                System.out.println(1);
            } else {
                prime = new boolean[2 * n + 1];
                get_prime();

                int count = 0;

                for (int i = n + 1; i <= 2 * n; i++) {
                    if (!prime[i]) {
                        count++;
                    }
                }

                System.out.println(count);
            }

        }

        sc.close();
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
}
