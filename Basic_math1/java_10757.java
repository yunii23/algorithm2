package algorithm2.Basic_math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//백준 기본수학1 큰수 A+B
//참고 https://st-lab.tistory.com/199
public class java_10757 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        a = a.add(b);

        System.out.println(a.toString());
    }
}
