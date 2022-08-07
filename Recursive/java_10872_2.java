package algorithm2.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_10872_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        System.out.println(Factorial(n));
    }

    public static int Factorial(int n) {

        // 종료조건
        if (n == 0) {
            return 1;
        }

        return n * Factorial(n-1);
        
    }
}
