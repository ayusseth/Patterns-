import java.util.InputMismatchException;
import java.util.Scanner;

public class Square_hollow
{
    public static void main(String[] args) {

        try(Scanner sc=new Scanner(System.in)) {
            int m = sc.nextInt(), n=sc.nextInt();
            if (m > 0 && n > 0) {
                System.out.println("* ".repeat(n));
                for (int i = 2; i <m ; i++) {
                    if(n>1){
                        System.out.println("*"+"  ".repeat(n-2)+" *");
                    }
                    else{
                        System.out.println("*");
                    }
                }
                if(m>1){
                    System.out.println("* ".repeat(n));
                }
            }
            else{
                System.out.println("both number must be positive");
            }
        } catch (InputMismatchException e) {
            System.out.println("invlid input, it must be INTEGER");
        }

    }
}
//        * * * * * *
//        *         *
//        *         *
//        *         *
//        *         *
//        * * * * * *
