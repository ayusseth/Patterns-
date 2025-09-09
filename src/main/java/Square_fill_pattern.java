import java.util.InputMismatchException;
import java.util.Scanner;

public class Square_fill_pattern
{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {

            int x=sc.nextInt();
            if (x>0) {
                for (int i = 1; i <=x ; i++) {
                    System.out.print("* ".repeat(x));
                    System.out.println();
                }
            }
            else{
                System.out.println("input must be greater than 0");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, must be positive integer");
        }
    }
}
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *
//        * * * * * *

