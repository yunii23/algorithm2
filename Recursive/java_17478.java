package algorithm2.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_17478 {
    // 백준 재귀 재귀함수가 뭔가요?

    public static String s1 = "\"재귀함수가 뭔가요?\"";
    public static String s2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    public static String s3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    public static String s4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    public static String s5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    public static String s6 = "라고 답변하였지.";

    public static int n;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        repeat(0);
        System.out.println(sb);
    }

    public static void repeat(int count) {

        repeat2(0, count);
        sb.append(s1).append("\n");

        // 종료조건
        if(count == n) {
            
            repeat2(0, count);
            sb.append(s5).append("\n");
            repeat2(0, count);
            sb.append(s6).append("\n");

            return;
        }

        repeat2(0, count);
        sb.append(s2).append("\n");
        repeat2(0, count);
        sb.append(s3).append("\n");
        repeat2(0, count);
        sb.append(s4).append("\n");

        count++;

        repeat(count);

        count--;
        repeat2(0, count);
        sb.append(s6).append("\n");

        return;
    }

    public static void repeat2(int d, int count) {
        
        if(d == count) {
            return;
        }

        sb.append("____");
        d++;
        repeat2(d, count);
        return;
    }
}
