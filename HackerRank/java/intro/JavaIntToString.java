import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String s = String.valueOf(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
