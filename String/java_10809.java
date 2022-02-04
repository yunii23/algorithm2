package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 알파벳찾기
public class java_10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "abcdefghijklmnopqrstuvwxyz";
        String[] str = s.split("");

        int[] arr = new int[26];

        for(int i=0; i<26; i++) {
            arr[i] = -1;
        }

        String word = br.readLine();
        String[] wordArr = word.split("");

        for(int i=0; i<wordArr.length; i++) {
            for(int j=0; j<26; j++) {
                if(wordArr[i].equals(str[j])) {

                    if(arr[j] == -1){
                        arr[j] = i;
                    }
                    
                }
            }
        }

        for(int i=0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
