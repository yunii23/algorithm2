package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 정렬 좌표 정렬하기
//2차원 배열 정렬 참고 https://gre-eny.tistory.com/2
public class java_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        
        StringTokenizer st;
        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }         
        }

        //0번째 element가 같으면 1번째 element로 compare하고, 같지 않으면 0번째 element로 compare 한다는 의미
        Arrays.sort(arr, (o1, o2) ->  {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
