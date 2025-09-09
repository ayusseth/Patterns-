import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_triangular
{
    public static void main(String[] args) {

        try ( Scanner sc=new Scanner(System.in)){
            int n= sc.nextInt();
            if (n>0) {
                for (int i = 1; i <=n ; i++) {
                    System.out.print(" ".repeat(n - i)); // spaces
                    System.out.print((i + " ").repeat(i));
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Input must be positive");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive INTEGER valued");
        }
        
    }

//                 1
//                2 2
//               3 3 3
//              4 4 4 4
//             5 5 5 5 5
//            6 6 6 6 6 6

}
