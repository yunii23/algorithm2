package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//백준 정렬 수 정렬하기2
//Arrays.sort로 성공은 했으나 시간 복잡도 상 다른걸 권장하는 문제라 수정
//참고 https://st-lab.tistory.com/106?category=857114
public class java_2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
 
        ArrayList<Integer> list = new ArrayList<>();
 
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int value : list){
            sb.append(value).append("\n");
        }
        System.out.print(sb);
    }


}


// 이게 내 원래 코드
// 근데 이게 더 시간 적게 들었다
// public class Main {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());
//         int[] arr = new int[n];

//         //StringTokenizer st = new StringTokenizer(br.readLine(), "");
//         for(int i=0; i<n; i++){
//             arr[i] = Integer.parseInt(br.readLine());
//         }

//         Arrays.sort(arr);

//         for(int i=0; i<n; i++){
//             sb.append(arr[i]).append("\n");
//         }
//         System.out.print(sb);
//     }
// }
