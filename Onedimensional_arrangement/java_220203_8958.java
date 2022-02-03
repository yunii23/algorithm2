package algorithm2.Onedimensional_arrangement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 1차원 배열 8958 OX퀴즈
public class java_220203_8958 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<n; i++) {
            String s = bf.readLine();
        
            String arr[] = s.split("");
            int result = 0;
            int count = 1;

            for(int j=0; j<=arr.length; j++) {
                
                if(j == (arr.length - 1)) {
                    if(arr[j].equals("O")) {
                        result += count;
                    }
                    break;
                }

                if(arr[j].equals("O")) {
                    if(arr[j].equals(arr[j+1])){
                        result += count;
                        count += 1;
                    }else {
                        result += count;
                        count = 1;
                    }
                }
            }

            bw.write(result + "\n");
            
        }
        bw.flush();
        bw.close();
        
    }
}
