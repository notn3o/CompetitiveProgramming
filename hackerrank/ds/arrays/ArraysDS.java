import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[n - 1]);
        for (int i = n - 2; i >= 0; --i) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
