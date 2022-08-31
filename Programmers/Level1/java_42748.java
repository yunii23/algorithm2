package algorithm2.Programmers.Level1;

import java.util.*;

public class java_42748 {
    // 프로그래머스 레벨1 k번째 수

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int x = commands[i][0];
            int y = commands[i][1];
            int k = commands[i][2];

            System.out.println(x + " " + y + " " + k);
            int[] arr = Arrays.copyOfRange(array, x-1, y);
            System.out.println(Arrays.toString(arr));
            
            Arrays.sort(arr);
            System.out.println(arr[k-1]);

            answer[i] = arr[k-1];
        }

        System.out.println(Arrays.toString(answer));
    }
}
