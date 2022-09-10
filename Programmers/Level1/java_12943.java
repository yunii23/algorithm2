package algorithm2.Programmers.Level1;

public class java_12943 {
    // 프로그래머스 레벨1 콜라츠 추측

    public static void main(String[] args) {
        int num = 1;
        long n = (long) num;
        int answer = 0;

        if (num == 1)
            answer = 1;
        else {
            int count = 0;
            int i = 0;
            while (i < 500) {

                if (n % 2 == 0)
                    n /= 2;
                else
                    n = n * 3 + 1;
                count++;

                if (n == 1) {
                    answer = count;
                    break;
                }

                i++;
            }

            if (i == 500)
                answer = -1;
        }

        System.out.println(answer);
    }
}
