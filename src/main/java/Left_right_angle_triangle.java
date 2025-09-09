import java.util.InputMismatchException;
import java.util.Scanner;

public class Left_right_angle_triangle
{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(n>0){
                for (int i = 1; i <=n ; i++) {
                    System.out.print(" ".repeat((n-i)*2)+"* ".repeat(i));
                    System.out.println();
                }
            }else {
                System.out.println("Input must be greater than 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive Integer");
        }
    }
}
//                  *
//                  * *
//                  * * *
//                  * * * *
//                  * * * * *
//                  * * * * * *
