import java.util.Scanner;

public class custom_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("A problem occured: " + e);
        }
    }

    static void checkAge(int age)throws ageExceptions{
        if(age < 18){
            throw new ageExceptions("You must be 18 or older to sign up");
        }else {
            System.out.println("You are now signed up");
        }
    }
}
