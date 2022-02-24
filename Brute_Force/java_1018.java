package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 브루트포스 체스판 다시 칠하기
//참고 https://imyena.tistory.com/25
//참고 https://st-lab.tistory.com/101?category=855026
public class java_1018 {
    public static boolean[][] arr;
    public static int min = 64; //촤대 변경 횟수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for(int i=0; i<n; i++) {
            String s = br.readLine();

            for(int j=0; j<m; j++) {
                if(s.charAt(j) == 'W') {
                    arr[i][j] = true; // w일때는 true
                } else {
                    arr[i][j] = false; // B일때는 false
                }
            }
        }


        int n_row = n-7;
        int m_col = m-7;

        for(int i=0; i<n_row; i++) {
            for(int j=0; j<m_col; j++) {
                find(i,j);
            }
        }

        System.out.println(min);
    }


    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y]; //첫번째 칸의 색

        for(int i=x; i<end_x; i++) {
            for(int j=y; j<end_y; j++) {

                //올바른 색이 아닐 경우 count 1 증가
                if(arr[i][j] != TF) {
                    count++;
                }

                //다음 칸은 색이 바뀌므로 
                //true면 false, false면 true로 값 변경

                TF = (!TF);
            }

            TF = !TF;
        }

        //첫번째 값을 기준으로 할 때의 색칠 할 개수(count)와
        //첫번째 칸의 색의 반대되는 색을 기준으로 할 때의
        //색칠 할 개수 (64-count) 중 최솟값을 count에 저장

        count = Math.min(count, 64-count);

        //이전까지의 경우 중 최솟값보다 현재 count값이 
        //더 작을 경우 최솟값으로 갱신
        min = Math.min(min, count);
    }
}
