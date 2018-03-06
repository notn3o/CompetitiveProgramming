import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n + 1];
        int a, b, k;
        long curr = 0, max = 0;
        for (int i = 0; i < m; ++i) {
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();
            arr[a] += k;
            if ((b + 1) <= n) arr[b + 1] -= k;
        }
        for (int i = 1; i <= n; ++i) {
            curr += arr[i];
            if (curr > max) {
                max = curr;
            }
        }
        System.out.println(max);
    }
}
