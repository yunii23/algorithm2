package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 정렬 수 정렬하기 3
//카운팅 정렬 사용 - 시간 복잡도 해결 때문
//참고 https://st-lab.tistory.com/107?category=857114
//참고 https://st-lab.tistory.com/104?category=856997
public class java_10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[10001];

        for(int i=0; i<n; i++) {
            //해당 인덱스의 값을 1 증가
            array[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<10001; i++) {

            while(array[i] > 0) {

                //i값이 개수가 0이 될 때 까지 출력(빈도수)
                sb.append(i).append("\n");
                array[i]--;
            }
        }

        System.out.println(sb);
    }
}
