import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q, t, x, y, index, size, lastAnswer = 0;
        n = sc.nextInt();
        q = sc.nextInt();
        List<List<Integer>> sequences = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; ++i) {
            sequences.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < q; ++i) {
            t = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if (t == 1) {
                index = (x ^ lastAnswer) % n;
                sequences.get(index).add(y);
            } else {
                index = (x ^ lastAnswer) % n;
                size = sequences.get(index).size();
                lastAnswer = sequences.get(index).get(y % size);
                System.out.println(lastAnswer);
            }
        }
        sc.close();
    }
}
