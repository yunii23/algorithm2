package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//백준 정렬 좌표압축
//참고 https://st-lab.tistory.com/279
public class java_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n]; // 원본 배열
        int[] sorted = new int[n]; // 정렬 할 배열
        HashMap<Integer, Integer> ranking = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        

        // 정렬 된 배열을 순회하면서 map에 넣어줌
        int rank = 0;
        for(int v : sorted) {
            // 중복되면 안되므로, 중복되지 않을 때만 
            // map에 원소와 그 대응하는 순위를 넣음
            if(!ranking.containsKey(v)) {
                ranking.put(v, rank);
                rank++;
            }
        }


        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int num = ranking.get(key); //원본 배열 원소(key)에 대한 value(순위) 가져옴
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}
