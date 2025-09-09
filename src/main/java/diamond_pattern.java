import java.util.InputMismatchException;
import java.util.Scanner;

public class diamond_pattern
{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {

            int n= sc.nextInt();
            if (n>0) {
                for (int i = 1; i <=n ; i++) {
                    System.out.print(" ".repeat(n-i));
                    System.out.print("* ".repeat(i));
                    System.out.println();
                }
                for (int i = n-1; i >=1 ; i--) {
                    System.out.print(" ".repeat(n-i));
                    System.out.print("* ".repeat(i));
                    System.out.println();
                }
            }
            else{
                System.out.println("Input must be grater than 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("!!Input must be Integer and positive");
        }

    }
}
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//           * * * * * *
//          * * * * * * *
//         * * * * * * * *
//          * * * * * * *
//           * * * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *