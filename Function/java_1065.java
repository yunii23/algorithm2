package algorithm2.Function;

import java.util.Scanner;

//백준 함수 한수
//참고 https://st-lab.tistory.com/54?category=837197
public class java_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(sum(n));

        sc.close();
    }

    public static int sum(int num) {
        //등차수열
        //an = a1 + (n-1)d

        int count = 0; 

        //1~99까지는 모두 한수
        if(num < 100) {
            return num;
        } else {
            //100이상의 수면 기본적으로 한수 최소 개수는 99
            count = 99;

            if(num == 1000) {
                //예외 처리
                //1000은 등차수열이 아니고, 1000보다 큰 수는 입력받지 않기 때문에 999로 변경
                num = 999;
            }

            for(int i=100; i<=num; i++) {
                int hun = i / 100; //백의자리수 
                int ten = (i/10) % 10; //십의자리수
                int one = i % 10; //일의자리수

                if((hun - ten) == (ten - one)) {
                    count ++;
                } 
            }
        }


        return count;
    }
}
