package algorithm2.Sets_and_Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.StringTokenizer;
//import java.util.stream.Stream;

public class java_10815 {
    // 백준 집합과 맵 숫자 카드
    // 정답 출력은 가능하지만 시간초과 문제 발생
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //int n = Integer.parseInt(br.readLine());
        //int[] have = new int[n];

        //StringTokenizer st = new StringTokenizer(br.readLine());
        // for(int i=0; i<n; i++) {
        //     have[i] = Integer.parseInt(st.nextToken());
        // }
        String s1 = br.readLine();
        String[] stringHave = s1.split(" ");
        int[] have = Arrays.stream(stringHave).mapToInt(Integer::parseInt).toArray();

        //int m = Integer.parseInt(br.readLine());
        //int[] arr = new int[m];
        //st = new StringTokenizer(br.readLine());
        // for(int i=0; i<m; i++) {
        //     arr[i] = Integer.parseInt(st.nextToken());
        // }
        String s2 = br.readLine();
        String[] stringArr = s2.split(" ");
        int[] arr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<have.length; j++) {

                if(have[j] == arr[i]) count++;
                
            }

            if(count == 1) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }

        System.out.println(sb.toString());
    }
}
