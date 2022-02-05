package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 문자열 단어의 개수
public class java_1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        //이렇게 하니까 에러나서 다른 방법으로
        //String[] arr = s.trim().split(" ");

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.print(st.countTokens());
    }
}
