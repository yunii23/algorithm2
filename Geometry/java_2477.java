package algorithm2.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_2477 {
    //백준 참외밭
    //참고 https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-2477%EB%B2%88-%EC%B0%B8%EC%99%B8%EB%B0%AD-%EC%9E%90%EB%B0%94Java

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine()); // 참외개수
        int maxWidth = 0;
        int maxHeight = 0;
        int widthIndex = 0;
        int heightIndex = 0;
        int nearW = 0;
        int nearH = 0;

        int[][] arr = new int[6][2];

        StringTokenizer st;
        for(int i=0; i<6; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 방향
            arr[i][1] = Integer.parseInt(st.nextToken()); // 길이

            // 3,4 세로 / 1,2 가로

            if(maxWidth < arr[i][1] && (arr[i][0] == 1 || arr[i][0] == 2)) {
                maxWidth = arr[i][1];
                widthIndex = i;
            }
            if(maxHeight < arr[i][1] && (arr[i][0] == 3 || arr[i][0] == 4)) {
                maxHeight = arr[i][1];
                heightIndex = i;
            }
        }

        if(widthIndex == 0) {
            nearH = Math.abs(arr[5][1] - arr[widthIndex+1][1]);
        }
        else if (widthIndex == 5) {
            nearH = Math.abs(arr[widthIndex-1][1] - arr[0][1]);
        }
        else {
            nearH = Math.abs(arr[widthIndex-1][1] - arr[widthIndex+1][1]);
        }

        if(heightIndex == 0) {
            nearW = Math.abs(arr[5][1] - arr[heightIndex+1][1]);
        }
        else if (heightIndex == 5) {
            nearW = Math.abs(arr[heightIndex-1][1] - arr[0][1]);
        }
        else {
            nearW = Math.abs(arr[heightIndex-1][1] - arr[heightIndex+1][1]);
        }

        System.out.println((maxWidth * maxHeight - (nearW * nearH)) * k);

    }
}
