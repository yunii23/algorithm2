package algorithm2.Sets_and_Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class java_14425 {
    //백준 집합과 맵 문자열 집합
    // 참고(문자열 이진탐색) https://96-brain.tistory.com/entry/%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%9E%90%EC%97%B4-2%EC%A7%84-%EA%B2%80%EC%83%89Binary-Search-%EC%98%88%EC%A0%9C

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] s = new String[n];
        for(int i=0; i<s.length; i++) {
            s[i] = br.readLine();
        }
        
        List<String> list = new ArrayList<>();
        for(String temp : s) {
            list.add(temp);
        }
        Collections.sort(list);

        String[] check = new String[m];
        for(int i=0; i<check.length; i++) {
            check[i] = br.readLine();
        }

        int count = 0;
        for(int i=0; i<check.length; i++) {
            if(BSearch(check[i], list) == 1) count ++;
        }

        System.out.println(count);
    }

    public static int BSearch(String target, List<String> list) {

        int begin = 0;
        int end = list.size()-1;

        while(begin <= end) {

            int mid = (begin + end) / 2;

            if(target.equals(list.get(mid))) return 1;
            else if(target.compareTo(list.get(mid)) < 0) end = mid - 1;
            else begin = mid + 1;
        }

        return 0;
    }
}
