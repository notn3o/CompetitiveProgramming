import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n)); 
    }
    public static String solve(int n) {
        if (n % 2 == 1) {
            return "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                return "Not Weird";
            } else if (n >= 6 && n <= 20) {
                return "Weird";
            } else if (n > 20) {
                return "Not Weird";
            } else {
                return "";
            }
        }
    }
    public static void test() {
        assert solve(3) == "Weird"; 
        assert solve(24) == "Not Weird";
    }
}
