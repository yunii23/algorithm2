package algorithm2.Programmers.Level1;

import java.util.Arrays;

public class java_12935 {
    // 프로그래머스 레벨1 제일 작은수 제거하기
    static int[] answer;

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            System.out.println(answer[0]);
        }
        else {
            int[] arrMin = Arrays.copyOf(arr, arr.length);
            Arrays.sort(arrMin);
            
            answer = new int[arr.length-1];

            int count = 0;

            for(int i=0; i<arr.length; i++) {
                if(arr[i] != arrMin[0]) {
                    answer[count] = arr[i];
                    count++;
                }
            }

            System.out.println(Arrays.toString(answer));
        }
        
    }
}
