import java.util.InputMismatchException;
import java.util.Scanner;

public class Reverse_number_triangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            if (n>0) {
                for (int i = 1; i <= n; i++) {
                    StringBuilder line=new StringBuilder(" ".repeat(i-1));
                    for (int j = i; j <=n; j++) {
                        line.append(j).append(" ");

                    }
                    System.out.println(line);
                }
            }
            else{
                System.out.println("Input must be greater than 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive integer");
        }
    }
}
//        1 2 3 4 5 6 7
//         2 3 4 5 6 7
//          3 4 5 6 7
//           4 5 6 7
//            5 6 7
//             6 7
//              7




















