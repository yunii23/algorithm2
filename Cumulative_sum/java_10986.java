package algorithm2.Cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 누적합 나머지 합
//https://velog.io/@isohyeon/Java-%EB%B0%B1%EC%A4%80-10986-%EB%82%98%EB%A8%B8%EC%A7%80-%ED%95%A9
public class java_10986 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long count = 0;

        long[] S = new long[n+1];
        long[] cnt = new long[m];

        // n개의 수를 입력받으면서 누적합을 m으로 나눈 나머지를 배열 S에 저장
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<n+1; i++) {
            S[i] = (S[i-1] + Integer.parseInt(st.nextToken())) % m; 

            if(S[i] == 0) {
                count++;
            }

            // 나머지가 같은 인덱스의 수 카운팅
            cnt[(int) S[i]] ++;
        }

        // S[j] % m == S[i-1] % m 을 만족하는 i, j의 수를 결과값에 더함
        // 즉 cnt[i]에서 (i가 나머지인 인덱스의 수) 2가지를 뽑은 경우의 수를 카운팅
        for(int i=0; i<m; i++) {
            if(cnt[i] > 1) {
                count += (cnt[i] * (cnt[i]-1) / 2); 
            }
        }
        System.out.println(count);
    }
}
