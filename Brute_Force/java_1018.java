package algorithm2.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 브루트포스 체스판 다시 칠하기
//참고 https://imyena.tistory.com/25
//참고 https://st-lab.tistory.com/101?category=855026
public class java_1018 {
    public static String[][] arr;
    public static int min = 10000;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로
        // int n = 11;
        // int m = 12;

        arr = new String[n][m];

        //String s = "WBWBWBWB\nBWBWBWBW\nWBWBWBWB\nBWBBBWBW\nWBWBWBWB\nBWBWBWBW\nWBWBWBWB\nBWBWBWBW";
        //String s = "BBBBBBBBWBWBW\nBBBBBBBBBWBWB\nBBBBBBBBWBWBW\nBBBBBBBBBWBWB\nBBBBBBBBWBWBW\nBBBBBBBBBWBWB\nBBBBBBBBWBWBW\nBBBBBBBBBWBWB\nWWWWWWWWWWBWB\nWWWWWWWWWWBWB";
        //String s = "BWBWBWBW\nWBWBWBWB\nBWBWBWBW\nWBWBWBWB\nBWBWBWBW\nWBWBWBWB\nBWBWBWBW\nWBWBWBWB";
        //String s = "BBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBB\nBBBBBBBBBBBBBBBBBBBBBBW";
        //String s = "BBBBBBBBBB\nBBWBWBWBWB\nBWBWBWBWBB\nBBWBWBWBWB\nBWBWBWBWBB\nBBWBWBWBWB\nBWBWBWBWBB\nBBWBWBWBWB\nBWBWBWBWBB\nBBBBBBBBBB";
        //String s = "WBWBWBWB\nBWBWBWBW\nWBWBWBWB\nBWBBBWBW\nWBWBWBWB\nBWBWBWBW\nWBWBWWWB\nBWBWBWBW";
        //String s = "BWWBWWBWWBWW\nBWWBWBBWWBWW\nWBWWBWBBWWBW\nBWWBWBBWWBWW\nWBWWBWBBWWBW\nBWWBWBBWWBWW\nWBWWBWBBWWBW\nBWWBWBWWWBWW\nWBWWBWBBWWBW\nBWWBWBBWWBWW\nWBWWBWBBWWBW";

        
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            String[] s_arr = s.split("");

            for(int j=0; j<m; j++) {
                arr[i][j] = s_arr[j];    
            }
        }

        // StringTokenizer st = new StringTokenizer(s);
        // for(int i=0; i<n; i++) {
        //     String s1 = st.nextToken();
        //     String[] s_arr = s1.split( "");

        //     for(int j=0; j<m; j++) {
        //         arr[i][j] = s_arr[j];    
        //     }
        // }

        if(n == 8 && m == 8) {
            chess(0, 0);
            changeChess(0, 0);
        }
        else {
            for(int i=0; i<=n-8; i++) {
                for(int j=0; j<=m-8; j++) {
                    
                    chess(i, j);
                    changeChess(i, j);
                }
            }
        }
        

        System.out.println(min);

    }

    public static void chess(int a, int b) {
        String start = arr[a][b];
        //System.out.println("start " + start + " " + a + " " + b);
        int count = 0;
        int a_value = 0;

        int imax = a + 8;
        int jmax = b + 8;
        for(int i=a; i<imax; i++) {
            int b_value = 0;
            for(int j=b; j<jmax; j++) {

                if(start.equals("W") && a_value % 2 == 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("B")) {count++; System.out.println("확인1 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("W")) {count++; System.out.println("확인2 " + i + " " + j);}
                }
                else if (start.equals("W") && a_value % 2 != 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("W")) {count++; System.out.println("확인3 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("B")) {count++; System.out.println("확인4 " + i + " " + j);}
                }
                else if (start.equals("B") && a_value % 2 == 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("W")) {count++; System.out.println("확인5 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("B")) {count++; System.out.println("확인6 " + i + " " + j);}
                }
                else if (start.equals("B") && a_value % 2 != 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("B")) {count++; System.out.println("확인7 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("W")) {count++; System.out.println("확인8 " + i + " " + j);}
                }

                b_value++;
            }
            a_value++;
        }

        if(min > count) min = count;
        System.out.println("count " + count);
    }


    public static void changeChess(int a, int b) {
        String start = arr[a][b];
        System.out.println("start " + start + " " + a + " " + b);
        int count = 0;
        int a_value = 0;

        int imax = a + 8;
        int jmax = b + 8;

        // start가 반대일때
        if(start.equals("W")) start = "B";
        else start = "W";
        
        for(int i=a; i<imax; i++) {
            int b_value = 0;
            for(int j=b; j<jmax; j++) {

                if(start.equals("W") && a_value % 2 == 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("B")) {count++; System.out.println("확인1 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("W")) {count++; System.out.println("확인2 " + i + " " + j);}
                }
                else if (start.equals("W") && a_value % 2 != 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("W")) {count++; System.out.println("확인3 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("B")) {count++; System.out.println("확인4 " + i + " " + j);}
                }
                else if (start.equals("B") && a_value % 2 == 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("W")) {count++; System.out.println("확인5 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("B")) {count++; System.out.println("확인6 " + i + " " + j);}
                }
                else if (start.equals("B") && a_value % 2 != 0) {
                    if(b_value % 2 == 0 && arr[i][j].equals("B")) {count++; System.out.println("확인7 " + i + " " + j);}
                    else if (b_value % 2 != 0 && arr[i][j].equals("W")) {count++; System.out.println("확인8 " + i + " " + j);}
                }

                b_value++;
            }
            a_value++;
        }

        if(min > count) min = count;
        System.out.println("count2 " + count);
    }
}
