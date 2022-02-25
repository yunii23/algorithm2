package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 정렬 통계학
//참고 https://subin-programming.tistory.com/17
public class java_2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] num = new int[8001]; 
        int sum = 0; //산술평균

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum +=  arr[i];
        }

        Arrays.sort(arr);

        int max = 0;
        for(int i=0; i<8001; i++) {
            num[arr[i] + 4000]++;
            max = Math.max(max, num[arr[i] + 4000]);
        }

        int second = 0;
        int count = 0;

        for(int i=0; i<num.length; i++) {
            if(num[i] == max) {
                count++;
                second = i - 4000;
            } 
            if(count == 2) {
                second = i - 4000;
                break;
            }
        }

        System.out.println(sum / n);
        System.out.println(arr[n/2]);
        System.out.println(second);
        System.out.println(arr[n-1] - arr[0]);

    }
}
