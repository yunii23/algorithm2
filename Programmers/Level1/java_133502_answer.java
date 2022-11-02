package algorithm2.Programmers.Level1;

import java.util.ArrayList;

// 프로그래머스 레벨1 햄버거만들기 시간초과 문제 해결 답안
public class java_133502_answer {
    public static void main(String[] args) {
        //int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        int answer = 0;

        ArrayList<Integer> hamList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        result.add(1);
        result.add(2);
        result.add(3);
        result.add(1);

        for(int i=0; i<ingredient.length; i++) {
            hamList.add(ingredient[i]);

            if(hamList.size() >= 4) {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(hamList.get(hamList.size()-4));
                tempList.add(hamList.get(hamList.size()-3));
                tempList.add(hamList.get(hamList.size()-2));
                tempList.add(hamList.get(hamList.size()-1));

                if(tempList.equals(result)) {
                    answer++;

                    hamList.remove(hamList.size()-1);
                    hamList.remove(hamList.size()-1);
                    hamList.remove(hamList.size()-1);
                    hamList.remove(hamList.size()-1);
                }
            }
        }

        System.out.println(answer);
    }
}
