package algorithm2.Basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학2 네번째점
public class java_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] X = new int[3];
        int[] Y = new int[3];

        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        if(X[0] == X[1]) {
            sb.append(X[2]).append(" ");
        }else if(X[0] == X[2]) {
            sb.append(X[1]).append(" ");
        }else{
            sb.append(X[0]).append(" ");
        }

        if(Y[0] == Y[1]) {
            sb.append(Y[2]);
        }else if(Y[0] == Y[2]) {
            sb.append(Y[1]);
        }else{
            sb.append(Y[0]);
        }

        System.out.println(sb.toString());
    }
}
