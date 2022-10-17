package algorithm2.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 백트래킹 N-Queen
// https://st-lab.tistory.com/m/118
public class java_9663 {

    // 원소의 index를 열, 원소 값을 행이라고 생각
    // 첫번째 열부터 한 개씩 채워나가면서 놓을 수 있는 위치라면 재귀 호출 하며 채워나감
    // 첫번째 열에서 행의 값을 찾고, 두번째 열에서 또 다른 행의 값을 찾는 것을 반복
    // 재귀 탐색을 하게 되면 기본적으로 열은 서로 다른 위치 -> 우리가 검사할 것은 다른 퀸과 동일한 행에 위치하는지와 대각선상에 위치하는지 임
    // 만약 공격 받지않는 위치라면 다음 재귀를 호출하고, 아닐 경우 반복문으로 넘어감

    static int[] arr;
    static int n; //체스판 크기
    static int count = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nQueen(0);
        System.out.println(count);
    }

    // 재귀 호출
    public static void nQueen(int dp) {

        // 모든 원소를 다 채우면 카운트를 1 증가시키고 리턴
        if(dp == n) {
            count ++;
            return;
        }

        for(int i=0; i<n; i++) {
            arr[dp] = i;

            // possibility() 해당 열에서 i 번째 행에 높을 수 있는지 검사
            if(Possibility(dp)) {
                nQueen(dp + 1);
            }
        }
    }

    // 놓을 위치가 다른 퀸으로부터 위협받는지 검사하는 조건문
    public static boolean Possibility(int col) {

        for(int i=0; i<col; i++) {
            
            // 해당 열의 행과 i열의 행이 일치할 경우 (같은 행에 존재할 경우)
            if(arr[col] == arr[i]) {
                return false;
            }

            // 대각선상에 놓여있는 경우
            // (열의 차와 행의 차가 같을 경우가 대각선에 높여있는 경우임)
            else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }

    
}
