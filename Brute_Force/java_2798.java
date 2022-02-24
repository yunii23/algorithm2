package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 브루트포스 블랙잭
//참고 https://st-lab.tistory.com/97
public class java_2798 {
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(black(n, m));

        
    }

    
    public static int black(int n, int m) {
        
        int max = 0;
        for(int i=0; i<n-2; i++) {

            for(int j=i+1; j<n-1; j++) {

                for(int k=j+1; k<n; k++) {

                    int result = arr[i] + arr[j] + arr[k];

                    //m과 값이 같으면 종료
                    if(result == m) {
                        return result;
                    }

                    //m보다 작으면서 m에 가까운 값인지 확인
                    if(result < m) {
                        if(result > max) {
                            max = result;
                        }
                    }
                    
                }
            }
        }

        return max;
    }
}
