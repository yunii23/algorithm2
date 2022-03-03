package algorithm2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//백준 정렬 단어정렬
//참고 https://st-lab.tistory.com/112
public class java_1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String s1, String s2) {
                //단어의 길이가 같을 경우
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2); //사전 순 정렬
                }

                //그 외 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append("\n");

        for(int i=1; i<n; i++) {
            //중복되지 않는 단어만 출력
            if(!arr[i].equals(arr[i-1])) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
