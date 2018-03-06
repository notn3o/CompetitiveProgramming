import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                // top row
                sum += arr[i][j];
                sum += arr[i][j+1];
                sum += arr[i][j+2];

                // mid row
                sum += arr[i+1][j+1];

                // bot row
                sum += arr[i+2][j];
                sum += arr[i+2][j+1];
                sum += arr[i+2][j+2];

                if (sum > max) {
                    max = sum;
                }

                sum = 0;
            }
        }
        System.out.println(max);
    }
}
