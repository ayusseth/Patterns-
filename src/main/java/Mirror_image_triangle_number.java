import java.util.InputMismatchException;
import java.util.Scanner;
public class Mirror_image_triangle_number {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Input must be greater than 0");
                return;
            }
            for (int i = 1; i <= n; i++) {
                for (int s = 1; s < i; s++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            for (int i = n; i >= 1; i--) {
                for (int s = 1; s < i; s++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive integer");
        }
    }
}

//            1 2 3 4 5 6 7
//             2 3 4 5 6 7
//              3 4 5 6 7
//               4 5 6 7
//                5 6 7
//                 6 7
//                  7
//                  7
//                 6 7
//                5 6 7
//               4 5 6 7
//              3 4 5 6 7
//             2 3 4 5 6 7
//            1 2 3 4 5 6 7

