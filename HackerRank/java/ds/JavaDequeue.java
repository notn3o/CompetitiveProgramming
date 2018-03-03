import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;
        for (int i = 0; i < n; ++i) {
            if (i >= m) {
                int first = deque.removeFirst();
                if (map.get(first) == 1) {
                    map.remove(first);
                } else {
                    map.put(first, map.get(first) - 1);
                }
            }
            int num = sc.nextInt();
            deque.addLast(num);
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
             
            max = Math.max(max, map.size());
        }
        sc.close();
        System.out.println(max);
    }
}
