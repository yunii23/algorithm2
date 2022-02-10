package algorithm2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 그룹 단어 체커
//참고 https://st-lab.tistory.com/69?category=838567
public class java_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<n; i++) {
            if(check() == true) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0; //반복문에서 문자를 꺼내올 때 앞선 문자와 연속되는지, 아닌지 판별
        //-> 아스키코드 숫자로 판별해서 int

        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            //charAt을 통해 문자열의 문자들을 하나씩 꺼내와 해당 단어가 prev의 값과 같은지 판별
            int now = str.charAt(i); // i번째 문자 저장(현재 문자)

            //앞선 문자와 i번째 문자가 같지 않다면
            if(prev != now) {
                
                //해당 문자가 처음 나오는 경우 (false인 경우)
                if(check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                }

                //해당 문자가 이미 나온적이 있는 경우(그룹 단어 아니게 됨)
                else {
                    return false;
                }
            }

            
            //앞선 문자와 i번째 문자가 같다면
            continue;
        }


        return true;
    }
}
