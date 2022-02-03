package algorithm2;

import java.util.Scanner;

public class java_210513_01 {
    //백준 재귀 피보나치
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        if(n == 0) {
            System.out.println("0");    
        } else if(n == 1){
            System.out.println("1");
        } else {
            System.out.println(result(n));
        }

        sc.close();
    }

    static int answer = 0;
    public static int result(int s){

        if(s<=2){
            return 1;
        }
        
        answer = result(s-1) + result(s-2);
        return answer;
    }
}
