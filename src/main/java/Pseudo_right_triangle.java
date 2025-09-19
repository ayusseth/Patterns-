import java.util.InputMismatchException;
import java.util.Scanner;

public class Pseudo_right_triangle
{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(n<0){
                System.out.println("Input must be greater than 0");
                return;
            }
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=i ; j++) {
                    if(i%2==0){
                        if(j%2!=0){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
                    else{
                        if(j%2==0){
                            System.out.print("  ");
                        }else {
                            System.out.print("* ");
                        }
                    }
                }
                System.out.println();
            }
            for (int i = n-1; i >=1 ; i--) {
                for (int j = 1; j <=i ; j++) {
                    if(i%2==0){
                        if(j%2!=0){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
                    else{
                        if(j%2==0){
                            System.out.print("  ");
                        }else {
                            System.out.print("* ");
                        }
                    }

                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be positive Integer");
        }
    }
}
//*
//  *
//*   *
//  *   *
//*   *   *
//  *   *   *
//*   *   *   *
//  *   *   *   *
//*   *   *   *   *
//  *   *   *   *   *
//*   *   *   *   *
//  *   *   *   *
//*   *   *   *
//  *   *   *
//*   *   *
//  *   *
//*   *
//  *
//*
