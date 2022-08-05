package algorithm2.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int min = B + C;

        if(min < 60) {
            System.out.println(A + " " + min);
        }

        else {
            while(min >= 60) {

                A ++;
                min -= 60;

                if(A == 24) A = 0;
            }
            
            System.out.println(A + " " + min);
        }
        
    }
}
