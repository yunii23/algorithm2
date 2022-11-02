package algorithm2.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 그리디 알고리즘 회의실 배정
//https://hongjw1938.tistory.com/172
public class java_1931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 회의의 수

        StringTokenizer st;
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken()); // 시작 시간
            arr[i][0] = Integer.parseInt(st.nextToken()); // 끝나는 시간
        }
        
        // 끝나는 시간 기준으로 정렬
        Arrays.sort(arr, (o1, o2) -> { 
            if(o1[0] == o2[0]){ 
                    return Integer.compare(o1[1],o2[1]); 
            } else{ 
                    return Integer.compare(o1[0],o2[0]); 
            }
        });

        
        int time = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            
            if(time <= arr[i][1]) {
                time = arr[i][0];
                count ++;
            }
        }

        System.out.println(count);
    }
}
