package algorithm2.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_10870_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(Sum(n));
    }

    public static int Sum(int n){

        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return Sum(n-1) + Sum(n-2);

    }
}
