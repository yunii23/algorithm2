package algorithm2.Basic_math1;

import java.util.Scanner;

//백준 기본 수학1 손익분기점
//참고 https://st-lab.tistory.com/71?category=841870
public class java_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        

        //(c * count) = a + (b * count)
        //(c * count) - (b * count) = a
        //count (c - b) = a
        //count = a / (c-b)
        //count는 수익이 같아지는 지점이므로 손익분기점은 count + 1
        // c-b에 따라서 달라지기 때문에 c-b이 음수면 이익이 발생하지 않음
        
        if (c-b <= 0) {
            System.out.println(-1);
        } else {
            
            System.out.println((a / (c - b)) + 1);
        }
        

        sc.close();
    }
}
