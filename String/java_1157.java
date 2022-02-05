package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 단어공부
public class java_1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();

        int[] arr = new int[26];


        //대문자 범위 65~90
        //소문자 범위 97~122
        for(int i=0; i<s.length(); i++) {
            
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 97]++;
            } else {
                arr[s.charAt(i) - 65]++;
            }
        }

        int max = -1;
        char ch = '?';

        for(int i=0; i<26; i++) {

            if(max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65);
            } 
            else if(max == arr[i]) {
                ch = '?';
            }
        }

        System.out.print(ch);

    }
}
