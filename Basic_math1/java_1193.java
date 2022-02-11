package algorithm2.Basic_math1;

import java.util.Scanner;

//백준 기본수학1 분수찾기
//참고 https://st-lab.tistory.com/74
public class java_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        //분모 분자 합 = T
        //대각선 칸의 개수 T-1

        //T가 홀수 일 때 오른쪽위에서 왼쪽 아래로 향함 
        //T가 짝수 일 때 왼쪽 아래에서 오른쪽 위로 향함

        // 즉 T % 2 = 0일 때 대각선 위 방향, 1일 때 아래 방향

        int cross_count = 1; //대각선 칸 개수
        int prev_count_sum = 0; //직전 대각선 누적 합

        while (true) {
            
            //직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if(x <= prev_count_sum + cross_count) {

                //대각선 개수 홀수라면
                if(cross_count % 2 == 1) {
                    //분모가 큰 수부터 시작
                    //분모 = 대각선 수 - (x - 직전 대각선 누적 합 - 1) 
                    //분자 = x - 직전 대각선 누적 합
                    System.out.print((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
                    break;
                }

                else{
                    // 대각선 개수가 짝수라면
                    System.out.print((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
                    break;
                }
            }

            else {
                prev_count_sum += cross_count;
                cross_count ++;
            }
        }

        sc.close();
    }
}
