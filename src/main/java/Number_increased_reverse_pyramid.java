import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_increased_reverse_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int m = sc.nextInt();

            if (m > 0) {
                StringBuilder sb=new StringBuilder();
                for (int i = 1; i <=m; i++) {
                    sb.append(i);
                }
                for (int i = m; i >0 ; i--) {
                    System.out.println(sb.substring(0,i));
                }
//                for (int i = m; i >0; i--) {
//                    int x = 1;
//                    for (int j = i; j > 0; j--) {
//                        System.out.print(x);
//                        x++;
//                    }
//                    System.out.println();
//                }
            } else {
                System.out.println("input must be positive");
            }
        } catch (InputMismatchException e) {
            System.out.println("!Invalid Input type! must be INTEGER");
        }
        sc.close();
    }
//            12345
//            1234
//            123
//            12
//            1
}
