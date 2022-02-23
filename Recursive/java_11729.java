package algorithm2.Recursive;

import java.util.Scanner;

//백준 재귀 하노이 탑 이동 순서
//참고 https://st-lab.tistory.com/96
//참고 https://iseunghan.tistory.com/214
public class java_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        //하노이 식
        //hanoi(n) = 2 * hanoi(n-1) + 1
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sb.append((int)(Math.pow(2, n) - 1)).append("\n");

        hanoi(n, 1, 2, 3);
        System.out.println(sb);

        sc.close();
    }

    // n 원판 개수
    // start 출발지
    // mid 옮기기 위해 이동해야 할 장소
    // to 목적지
    public static void hanoi(int n, int start, int mid, int to) {
        
        if(n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // A -> C로 옮긴다고 가정할 때
        // 1. n-1개를 A에서 B로 이동 (= start 지점의 n-1개의 원판을 mid 지점으로 옮김)
        hanoi(n-1, start, to, mid);

        //2. 1개를 A에서 C로 이동 (= start 지점에서 n번째 원판을 to 지점으로 옮김)
        sb.append(start + " " + to + "\n");

        //3. n-1개를 B에서 C로 이동 (= mid 지점의 n-1개의 원판을 to 지점으로 옮김)
        hanoi(n-1, mid, start, to);
    }
}
