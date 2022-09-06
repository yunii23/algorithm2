package algorithm2.Programmers.Level1;

import java.util.Arrays;
import java.util.HashMap;

public class java_42840 {
    // 프로그래머스 레벨1 모의고사

    public static void main(String[] args) {
        //int[] answers = {1,2,3,4,5};
        int[] answers = {1,3,2,4,2};
        int[] answer;

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int oneCount = 0; 
        int twoCount = 0;
        int threeCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        int j = 0;
        int k = 0;
        int l = 0;
        for(int i=0; i<answers.length; i++) {

            //1번
            if(j == 5) j = 0;
            if(answers[i] == one[j]) {
                System.out.println(i + " 들어옴1 " + answers[i] + " " + one[j]);
                oneCount ++;
                map.replace(1, map.get(1) + 1);
            }

            //2번
            if(k == 8) k = 0;
            if(answers[i] == two[k]) {
                System.out.println(i + " 들어옴2");
                twoCount ++;
                map.replace(2, map.get(2) + 1);
            }

            //3번
            if(l == 10) l = 0;
            if(answers[i] == three[l]) {
                System.out.println(i + " 들어옴3");
                threeCount ++;
                map.replace(3, map.get(3) + 1);
            }

            j++;
            k++;
            l++;
        }

        if(oneCount > twoCount && oneCount > threeCount) {
            answer = new int[1]; 
            answer[0] = 1; 
            System.out.println("1 " + Arrays.toString(answer) + " " + oneCount + " " + twoCount + " " + threeCount);
        } 

        else if(twoCount > oneCount && twoCount > threeCount) {
            answer = new int[1];
            answer[0] = 2;
            System.out.println("2 " + Arrays.toString(answer));
        }

        else if(threeCount > oneCount && threeCount > twoCount) {
            answer = new int[1];
            answer[0] = 3;
            System.out.println("3 " + Arrays.toString(answer));
        }

        else if(oneCount == twoCount && oneCount == threeCount) {
            answer = new int[3];
            answer[0] = 1; answer[1] = 2; answer[2] = 3;
            System.out.println("4 " + Arrays.toString(answer));
        }

        else if(oneCount == twoCount && oneCount > threeCount) {
            answer = new int[2];
            answer[0] = 1; answer[1] = 2;
            System.out.println("5 " + Arrays.toString(answer));
        }

        else if(oneCount == threeCount && oneCount > twoCount) {
            answer = new int[2];
            answer[0] = 1; answer[1] = 3;
            System.out.println("6 " + Arrays.toString(answer));
        }

        else {
            answer = new int[2];
            answer[0] = 2; answer[1] = 3;
            System.out.println("7 " + Arrays.toString(answer));
        }
     
        
    }

}