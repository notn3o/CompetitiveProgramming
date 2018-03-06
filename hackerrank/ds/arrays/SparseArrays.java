import java.util.Scanner;

public class SparseArrays {
    public static int howMany(String[] s, String qs) {
        int total = 0;
        for (int i = 0; i < s.length; ++i) {
            if (qs.equals(s[i])) {
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        String qs = null;
        for (int i = 0; i < n; ++i) {
            s[i] = sc.next();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; ++i) {
            qs = sc.next(); 
            System.out.println(howMany(s, qs));
        }
        sc.close();
    }
}
