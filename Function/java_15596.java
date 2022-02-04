package algorithm2.Function;

//백준 함수 정수 N개의 합
class java_15596 {
    long sum(int[] a) {
        long result = 0;

        for(int i=0; i<a.length; i++) {
            result += a[i];
        }

        return result;
    }
}
