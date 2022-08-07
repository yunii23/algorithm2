package algorithm2.For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_25304 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 총금액
        int X = Integer.parseInt(br.readLine());
        // 물건 종류 수 
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        // 물건 가격 + 개수
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int price = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());

            sum += price * amount;
        }
        
        if(X == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
