package algorithm2.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_2447_2 {
    // 백준 재귀 2447 다시 풀기
    // 참고 https://st-lab.tistory.com/95

    static char[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        star(0, 0, n, false);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void star(int x, int y, int n, boolean blank) {

        // 공백칸
        if(blank == true) {
            for(int i=x; i<x+n; i++) {
                for(int j=y; j<y+n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더 이상 쪼갤 수 없는 블록일 때
        if(n == 1) {
            arr[x][y] = '*';
            return;
        }


        // n = 27 일 경우 한 블록의 사이즈는 9
        // n = 9 일 경우 한 블록의 사이즈는 3
        // size는 해당 블록의 한 칸을 담을 변수를 의미

        // count는 별 출력 누적 합을 의미하는 변수 -> 4번 별을 출력하면 다음은 공백이기 때문

        int size = n/3;
        int count = 0;

        for(int i=x; i<x+n; i+=size) {
            for(int j=y; j<y+n; j+= size) {
                count ++;
                if(count == 5) {
                    star(i, j, size, true);
                }
                else {
                    star(i, j, size, false);
                }
            }
        }
    }
    
    

}
