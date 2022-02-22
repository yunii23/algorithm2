package algorithm2.Basic_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 기본수학2 터렛
//참고 https://st-lab.tistory.com/90?category=844846
public class java_1002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int minR = (int)Math.pow(r2-r1, 2); //반지름 차
            int sumR = (int)Math.pow(r2+r1, 2); //반지름 합
            int distance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); //두점사이거리
            
            //무한개 일 때 -1
            if(x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }

            //접점 없을 때 - 두 점 사이의 거리가 각 원 반지름의 합보다 클 때
            else if (distance > sumR ){
                System.out.println(0);
            }

            //접점 없을 때 - 한 원 안에 다른 원이 있으면서 접점이 없을 때
            else if (distance < minR ){
                System.out.println(0);
            }

            //접점 1개 - 두 점 사이의 거리가 각 원 반지름의 합과 같을 때
            else if (distance == sumR) {
                System.out.println(1);
            }

            //접점 1개 - 한 원 안에 다른 원이 있으면서 접점이 한 개 있을 때
            else if (distance == minR) {
                System.out.println(1);
            } 

            //접점 2개
            else {
                System.out.println(2);
            }


        }
    }
}
