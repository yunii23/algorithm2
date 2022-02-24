package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 브루트포스 덩치
public class java_7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] body = new int[n][2];
        StringTokenizer st;
        for(int i=0; i<body.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<body[i].length; j++) {
                body[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] score = new int[n];
        for(int i=0; i<n; i++ ){
            score[i] = 1;
        }


        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                
                //키와 몸무게 둘다 크다면
                if(body[i][0] > body[j][0] && body[i][1] > body[j][1]) {
                    score[j] ++;
                } 
                
                else if (body[i][0] < body[j][0] && body[i][1] < body[j][1]) {
                    score[i] ++;
                }

            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(score[i] + " ");
        }
    }
}
