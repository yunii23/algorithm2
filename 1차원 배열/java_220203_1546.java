import java.util.*;

public class java_220203_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Double[] arr = new Double[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
        }
        
        Arrays.sort(arr);
        Double m = arr[n-1];
        Double result = 0.0;
        
        for(int i=0; i<n; i++) {
            arr[i] = arr[i]/m*100;
            result += arr[i];
        }
        
        System.out.print(result/n);
        sc.close();
    }
}
