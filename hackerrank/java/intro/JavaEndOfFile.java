import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        int n = 1;
        while (sc.hasNext()) {
            line = sc.nextLine();
            System.out.println(n + " " + line);
            n++;
        }
        sc.close();
    }
}
