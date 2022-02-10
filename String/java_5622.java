package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 다이얼
public class java_5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] arr = s.split("");
        
        int time = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("A") || arr[i].equals("B") || arr[i].equals("C")) {
                time += 3;
            } else if(arr[i].equals("D") || arr[i].equals("E") || arr[i].equals("F")) {
                time += 4;
            } else if(arr[i].equals("G") || arr[i].equals("H") || arr[i].equals("I")) {
                time += 5;
            } else if(arr[i].equals("J") || arr[i].equals("K") || arr[i].equals("L")) {
                time += 6;
            } else if(arr[i].equals("M") || arr[i].equals("N") || arr[i].equals("O")) {
                time += 7;
            } else if(arr[i].equals("P") || arr[i].equals("Q") || arr[i].equals("R") || arr[i].equals("S")) {
                time += 8;
            } else if(arr[i].equals("T") || arr[i].equals("U") || arr[i].equals("V")) {
                time += 9;
            } else if(arr[i].equals("W") || arr[i].equals("X") || arr[i].equals("Y") || arr[i].equals("Z")) {
                time += 10;
            }
        }

        System.out.print(time);


    }
}
