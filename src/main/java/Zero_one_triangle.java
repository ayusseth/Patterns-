import java.util.Scanner;

public class Zero_one_triangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {

            if (i%2==0) {
                int x=0;
                for (int j = 1; j <=i ; j++) {

                    System.out.print(x+" ");
                    x++;
                    if(x>1){
                        x=1;
                        x--;
                    }
                }
                System.out.println();
            }
            else{
                int x=1;
                for (int j = 1; j <=i ; j++) {

                    System.out.print(x+" ");
                    if(x>0){
                        x--;
                    }
                }
                System.out.println();
            }
        }//not completed yet
    }
}
