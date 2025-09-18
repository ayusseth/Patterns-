import java.util.InputMismatchException;
import java.util.Scanner;

public class Hollow_hourglass_pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Input must be greater than 0");
                return;
            }
            for (int i = n; i >= 1; i--) {
                System.out.print(" ".repeat(n - i));
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i || i == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            for (int i = 2; i <= n; i++) {
                System.out.print(" ".repeat(n - i));
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i || i == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be Positive Integer");
        }
    }
}
//* * * * * *
// *       *
//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
// *       *
//* * * * * *
