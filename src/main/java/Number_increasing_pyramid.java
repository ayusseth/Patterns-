import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_increasing_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int m = sc.nextInt();
            if(m>0){
                StringBuilder sb=new StringBuilder();
                for (int i = 1; i <=m ; i++) {
                    sb.append(i);
                    System.out.println(sb);

                }
            }
            else{
                System.out.println("number must be positive");
            }
        } catch (InputMismatchException e)
        {
            System.out.println("!Invalid Input! input must be positive INTEGER");
        }
        sc.close();
    }
}
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789
//        12345678910
