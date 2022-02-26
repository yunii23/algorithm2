package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 정렬 소트인사이드
public class java_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
