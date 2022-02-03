package algorithm2.Onedimensional_arrangement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 1차원 배열 평균은 넘겠지
public class java_220203_4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(bf.readLine());

        for(int i=0; i<c; i++) {
            String s = bf.readLine();

            String[] arr = s.split(" ");
            Double[] score = new Double[arr.length];

            int n = Integer.parseInt(arr[0]);
            Double sum = 0.0;

            for(int j=1; j<=n; j++) {
                score[j-1] = Double.parseDouble(arr[j]);
                sum += score[j-1];
            }
            
            Double result = sum / n;
            Double count = 0.0;


            for(int j=0; j<n; j++) {
                if(result < score[j]){
                    count ++;
                }
            }

            bw.write(String.format("%.3f", (count / n) * 100) + "%\n");
        }

        bw.flush();
        bw.close();
    }
}
