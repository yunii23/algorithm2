package algorithm2.Function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//백준 함수 셀프 넘버
//참고 https://st-lab.tistory.com/53?category=837197
public class java_4673 {
    public static void main(String[] args) throws IOException{

        boolean[] check = new boolean[10001];
        for(int i=1; i<10001; i++) {
            int n = d(i);

            //return 된 수는 생성자가 있는 수 이므로 true로 바꿔줌
            if(n < 10001) {
                check[n] = true;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=1; i<10001; i++) {
            if(!check[i]) { //false만
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static int d(int number) {
        int sum = number; // number을 생성자로 하는 수를 리턴하기 위함

        while(number != 0) {
            // 각 자리수를 더해주기 위해 나머지 연산자와 나눗셈 연산자로 10단위씩
            //number을 줄여갈 것이기 때문에 number가 0이 아닐 때 까지 반복

            sum = sum + (number % 10);
            number = number/10;
        }

        return sum;
    }
}
