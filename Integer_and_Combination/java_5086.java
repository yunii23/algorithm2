package algorithm2.Integer_and_Combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_5086 {
    // 백준 배수와 약수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        while(true){
            int count = 0; //1-f, 2-m, 3-n
            st = new StringTokenizer(br.readLine());
            
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(n1 == n2 && n1 == 0) break;

            if(n2 % n1 == 0) count = 1;
            else if(n1 % n2 == 0) count = 2;
            else count = 3;

            switch(count) {
                case 1: 
                    System.out.println("factor");
                    break;
                case 2:
                    System.out.println("multiple");
                    break;
                case 3:
                    System.out.println("neither");
                    break;
            }
        }
    }
}
