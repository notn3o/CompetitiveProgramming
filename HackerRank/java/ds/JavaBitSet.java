import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a, b;
        String operation = null;
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for (int i = 0; i < m; ++i) {
            operation = sc.next();
            a = sc.nextInt();
            b = sc.nextInt();
            switch (operation) {
                case "AND":
                    if (a == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b2);
                    }
                break;
                case "OR":
                    if (a == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                break;
                case "XOR":
                    if (a == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                break;
                case "FLIP":
                    if (a == 1) {
                        b1.flip(b);
                    } else {
                        b2.flip(b);
                    }
                break;
                case "SET":
                    if (a == 1) {
                        b1.set(b);
                    } else {
                        b2.set(b);
                    }
                break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        sc.close();
    }
}
