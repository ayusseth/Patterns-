import java.util.InputMismatchException;
import java.util.Scanner;

public class Right_angle_triangle
{
    public static void main(String[] args) {

        try(Scanner sc=new Scanner(System.in);) {
            int x=sc.nextInt();
            if (x>0) {
                for (int i = 1; i <=x ; i++) {
                    System.out.print(" *".repeat(i));
                    System.out.println();
                }
            }
            else{
                System.out.println("input must be grater than 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch!! must be positive integer");
        }
    }
}
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *