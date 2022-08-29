package algorithm2.Programmers.Level1;

import java.util.HashMap;
import java.util.Map.Entry;

public class java_42576 {
    // 프로그래머스 레벨1 완주하지 못한 선수
    // 참고 https://junghn.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%99%84%EC%A3%BC%ED%95%98%EC%A7%80-%EB%AA%BB%ED%95%9C-%EC%84%A0%EC%88%98-%ED%95%B4%EC%8B%9C-1

    public static void main(String[] args) {
        //String[] participant = {"leo", "kiki", "eden"};
        //String[] completion = {"eden", "kiki"};

        // String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        // String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);

        }

        for(int i=0; i<completion.length; i++) {
            map.put(completion[i], map.get(completion[i])-1);
        }

        for(Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

        System.out.println(answer);

        
    }
}
