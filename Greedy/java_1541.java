package algorithm2.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 그리디 알고리즘 잃어버린 괄호
//https://st-lab.tistory.com/148
public class java_1541 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = Integer.MAX_VALUE;

        StringTokenizer min = new StringTokenizer(br.readLine(), "-");

        while(min.hasMoreTokens()) {

            int temp = 0;

            // 뺼셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더함
            StringTokenizer hap = new StringTokenizer(min.nextToken(), "+");

            while(hap.hasMoreTokens()) {
                temp += Integer.parseInt(hap.nextToken());
            }

            if(sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);
    }
}
