import java.util.InputMismatchException;
import java.util.Scanner;

public class Rhombus_pattern {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), m = sc.nextInt();
            if (n > 0 && m > 0) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(" ".repeat(i));
                    System.out.print("* ".repeat(m));
                    System.out.println();
                }
            } else {
                System.out.println("both input must be greater than 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, only INTEGER accepted");
        }
    }
}
//        * * * * * *
//          * * * * * *
//           * * * * * *
//            * * * * * *
//             * * * * * *