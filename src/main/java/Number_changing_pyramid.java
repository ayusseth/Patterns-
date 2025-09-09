import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_changing_pyramid
{
    public static void main(String[] args) {

        try(Scanner sc=new Scanner(System.in)) {
            int m=sc.nextInt();
            if (m>0) {
                int x=1;
                for (int i = 1; i <=m ; i++) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print(x+" ");
                        x++;
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("input must be positive");
            }

        } catch (InputMismatchException e) {
            System.out.println("!Invalid Input type! must be INTEGER");
        }
    }
}

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21