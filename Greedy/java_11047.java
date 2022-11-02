package algorithm2.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 그리디 알고리즘 동전 0
public class java_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;

        int n = Integer.parseInt(st.nextToken()); // 가지고 있는 동전 종류
        int k = Integer.parseInt(st.nextToken()); // 만들어야 할 값

        int[] money = new int[n];
        //st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1; i>=0; i--) {

            int defaultMoney = k;
            int count = 0;
            int j = i;
            while(defaultMoney != 0) {
                if(j < 0 && defaultMoney != 0) break;
            
                int change = defaultMoney / money[j];
                defaultMoney -= change * money[j];
                count += change;
                j--;
                System.out.println(change + " " + defaultMoney + " " + count + " " + i);

            }

            if(defaultMoney == 0 && min > count) min = count;
        }

        System.out.println(min);
        

    }
}
