package algorithm2.Programmers.Level1;

import java.util.Arrays;
import java.util.*;
import java.util.StringTokenizer;

public class java_92334 {
    // 신고 결과 받기

    public static void main(String[] args) {
        
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        // String[] id_list = {"con", "ryan"};
        // String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        // int k = 3;

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] resultReport = hashSet.toArray(new String[0]);

        String[][] arr = new String[id_list.length][4];
        Map<String, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<id_list.length; i++) {
            arr[i][0] = id_list[i]; //id
            arr[i][1] = "0"; // 신고받은 횟수
            arr[i][2] = ""; // 이 회원이 신고한 id
            arr[i][3] = "N"; // 정지여부

            map.put(id_list[i], 0);
        }
        //System.out.println(map);

        for(int i=0; i<resultReport.length; i++) {
            StringTokenizer st = new StringTokenizer(resultReport[i], " ");
            String reporter = st.nextToken();
            String reported = st.nextToken();

            for(int j=0; j<arr.length; j++) {
                if(arr[j][0].equals(reported)) arr[j][1] = Integer.toString(Integer.parseInt(arr[j][1]) + 1) ;
                
                if(arr[j][0].equals(reporter)) arr[j][2] += reported + ",";
            }
        }

        System.out.println(Arrays.deepToString(arr));

        for(int i=0; i<arr.length; i++) {
            if(Integer.parseInt(arr[i][1]) >= k) arr[i][3] = "Y";
        }

        for(int i=0; i<resultReport.length; i++) {
            StringTokenizer st = new StringTokenizer(resultReport[i], " ");
            String reporter = st.nextToken();
            String reported = st.nextToken();

            for(int j=0; j<arr.length; j++) {
                System.out.println(arr[j][0] + " " + arr[j][3] + " " + reporter + " " + reported);
                if(arr[j][3].equals("Y") && arr[j][0].equals(reported)) {
                    map.replace(reporter, map.get(reporter)+1);
                    //System.out.println(map);
                    //break;
                    
                }
            }
        }

        Collection<Integer> values = map.values();
        Integer[] count = values.toArray(new Integer[0]);
        System.out.println(Arrays.toString(count));

        int[] answer = Arrays.stream(count).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
