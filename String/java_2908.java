package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 문자열 상수
public class java_2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        int[] num = new int[2];

        for(int i=0; i<2; i++) {
            num[i] = Integer.parseInt(st.nextToken());

            int h = num[i] / 100; // 백
            int t = (num[i] / 10) % 10; //십
            int o = num[i] % 10; //일

            num[i] = (o * 100) + (t * 10) + h;
        }
        
        if(num[0] < num[1]) {
            System.out.print(num[1]);
        }else {
            System.out.print(num[0]);
        }
    }
}
