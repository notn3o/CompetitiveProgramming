import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q, a, b, n, s, exp;
        q = sc.nextInt();
        for (int i = 0; i < q; ++i) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            System.out.print(a + b);
            s = a + b;
            exp = 2;
            for (int j = 1; j < n; ++j) {
                s += exp * b;
                exp <<= 1;
                System.out.print(" " + s);
            }
            System.out.println();
        }
        sc.close();
    }
}
