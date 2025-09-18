import java.util.Scanner;

public class Reverse_right_angle_triangle
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                System.out.print("* ".repeat(i));
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive Integer");
        }
    }
}
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *