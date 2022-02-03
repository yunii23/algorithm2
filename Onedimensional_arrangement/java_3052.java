package algorithm2.Onedimensional_arrangement;

import java.util.*;

//백준 1차원 배열 3052 나머지
public class java_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            map.put(arr[i] % 42, i);
        }

        System.out.print(map.size());

        sc.close();
    }

}
