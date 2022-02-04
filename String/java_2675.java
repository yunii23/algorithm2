package algorithm2.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 문자열 문자열반복
public class java_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
            int a = Integer.parseInt(st.nextToken()); //첫번째 호출
            String b = st.nextToken(); //두번째 호출
            String[] arr = b.split("");

            for(int j=0; j<arr.length; j++) {
                for(int k=0; k<a; k++) {
                    bw.write(arr[j]);
                }
                
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
