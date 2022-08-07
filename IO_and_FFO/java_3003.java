package algorithm2.IO_and_FFO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_3003 {
    public static void main(String[] args) throws IOException{
        
        // 킹, 퀸, 룩, 비숍, 나이트, 폰 순서로 입력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[7];
        int i = 0;
        while(st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        if(arr[0] == 1) {
            sb.append(0).append(" ");
        } else if(arr[0] > 1) {
            sb.append((arr[0] - 1) * -1).append(" ");
        } else {
            sb.append((1 - arr[0])).append(" ");
        }

        if(arr[1] == 1) {
            sb.append(0).append(" ");
        } else if(arr[1] > 1) {
            sb.append((arr[1] - 1) * -1).append(" ");
        } else {
            sb.append((1 - arr[1])).append(" ");
        }

        if(arr[2] == 2) {
            sb.append(0).append(" ");
        } else if(arr[2] > 2) {
            sb.append((arr[2] - 2) * -1).append(" ");
        } else {
            sb.append((2 - arr[2])).append(" ");
        }

        if(arr[3] == 2) {
            sb.append(0).append(" ");
        } else if(arr[3] > 2) {
            sb.append((arr[3] - 2) * -1).append(" ");
        } else {
            sb.append((2 - arr[3])).append(" ");
        }

        if(arr[4] == 2) {
            sb.append(0).append(" ");
        } else if(arr[4] > 2) {
            sb.append((arr[4] - 2) * -1).append(" ");
        } else {
            sb.append((2 - arr[4])).append(" ");
        }

        if(arr[5] == 8) {
            sb.append(0).append(" ");
        } else if(arr[5] > 8) {
            sb.append((arr[5] - 8) * -1).append(" ");
        } else {
            sb.append((8 - arr[5])).append(" ");
        }

        System.out.println(sb.toString());
    }
}
