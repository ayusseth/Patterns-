import java.util.InputMismatchException;
import java.util.Scanner;

public class K_pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            if (n > 0) {
                for (int i = n; i >= 1; i--) {
                    System.out.println("* ".repeat(i));
                }
                for (int i = 1; i <= n; i++) {
                    System.out.println("* ".repeat(i));
                }
            } else {
                System.out.println("Input must be greater than 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive Integer");
        }
    }
}
