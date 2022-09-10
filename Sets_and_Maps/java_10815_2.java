package algorithm2.Sets_and_Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class java_10815_2 {
    //백준 집합과 맵 숫자카드 이진탐색 사용
    static int[] have;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        have = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            have[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(have);

        int m = Integer.parseInt(br.readLine());
        arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            sb.append(BSearch(arr[i])).append(" ");
        }

        System.out.println(sb.toString());

        
    }

    public static int BSearch(int target) {
        
        int low = 0;
        int high = have.length - 1;
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(have[mid] == target) {
                return 1;
            }
            else if(have[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        
        return 0;
    }
}
