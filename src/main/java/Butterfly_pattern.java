import java.util.Scanner;

public class Butterfly_pattern
{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(n<=0){
                System.out.println("Input must be greater than 0");
                return;
            }
            for (int i = 1; i <=n ; i++){
                System.out.println("*".repeat(i)+" ".repeat((2*n)-(2*i))+"*".repeat(i));
            }
            for (int i = n-1; i >=1 ; i--) {
                System.out.println("*".repeat(i)+" ".repeat((2*n)-(2*i))+"*".repeat(i));
            }
        } catch (Exception e) {
            System.out.println("Input must be positive Integer");
        }

    }
}
//        *                  *
//        **                **
//        ***              ***
//        ****            ****
//        *****          *****
//        ******        ******
//        *******      *******
//        ********    ********
//        *********  *********
//        ********************
//        *********  *********
//        ********    ********
//        *******      *******
//        ******        ******
//        *****          *****
//        ****            ****
//        ***              ***
//        **                **
//        *                  *
