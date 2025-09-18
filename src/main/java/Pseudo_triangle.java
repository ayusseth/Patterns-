import java.util.InputMismatchException;
import java.util.Scanner;

public class Pseudo_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Input must be greater than 0");
                return;
            }
            for (int i = 1; i <= n; i++) {
                int x = i - 1;
                System.out.print(" ".repeat(n - i));
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("1 ");
                    } else {
                        System.out.print(x);
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive Integer");
        }
    }
}
