package algorithm2.Programmers.Level1;

public class java_12948 {
    // 프로그래머스 레벨1 핸드폰 번호 가리기

    public static void main(String[] args) {
        String phone_number = "027778888";

        String answer = "";

        for(int i=0; i<phone_number.length(); i++) {
            
            if(i > phone_number.length()-5) answer += phone_number.charAt(i);
            else answer += "*";
        }

        System.out.println(answer);
    }
}
