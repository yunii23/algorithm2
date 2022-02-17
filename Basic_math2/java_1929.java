package algorithm2.Basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학2 소수 구하기
//참고 https://st-lab.tistory.com/84
public class java_1929 {

    public static boolean[] prime; //소수를 체크할 배열

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime = new boolean[n+1];
        make_prime();
        
        StringBuilder sb = new StringBuilder();

        for(int i = m; i<=n; i++) {
            // f = 소수
            if(!prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);

    }


    public static void make_prime() {
        
        //소수가 아닌 인덱스 t
        //소수인 인덱스 f

        prime[0] = prime[1] = true;


        for(int i=2; i<=Math.sqrt(prime.length); i++) {

            //이미 체크된 배열이면 다음 반복문으로 skip
            if(prime[i] == true) {
                continue;
            }

            //i의 배수를 걸러주기 위한 반복문
            for(int j=i*i; j<prime.length; j=j+i) {
                prime[j] = true;
            }
        }

    }
}
