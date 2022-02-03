package algorithm2.Onedimensional_arrangement;

import java.util.Scanner;
//백준 1차원 배열 숫자의 개수
public class java_2577 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = Integer.toString(a*b*c);
        
        //0~9
        for(int i=0; i<10; i++) {
            int count = 0;
            for(int j=0; j<result.length(); j++) {
                //아스키코드 때문에 -'0' 해줘야함
                if(result.charAt(j) - '0' == i){
                    count ++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}
