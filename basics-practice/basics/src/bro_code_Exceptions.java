
import java.util.Scanner;
import java.util.*;


public class bro_code_Exceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter an integer to divide ");

            int x = sc.nextInt();

           System.out.println("Enter an integer to divide by");
         int y = sc.nextInt();

         int z = x / y;

            System.out.println("Result :" +z);
    }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e);
        }
        catch(InputMismatchException e){
            System.out.println("Just enter a number you dumbass");
        }finally {
            sc.close();
        }
}
}
