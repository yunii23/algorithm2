package algorithm2.Programmers.Level1;

public class java_87389 {
    // 프로그래머스 레벨1 나머지가 1이 되는 수 찾기
    
    public static void main(String[] args) {
        int n = 12;
        int answer = n;

        for(int i=1; i<n; i++) {
            if(n % i == 1) {
                if(answer > i) answer = i;
            }
        }

        System.out.println(answer);
    }

}
