import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        String[] numbers = new String[3];
        numbers[0] = "10";
        numbers[1] = "20";
        numbers[2] = "30";

        try{
        for(int base = 10; base >= 2; --base){
            for(int j= 0; j <= 3; ++j){
                int i = Integer.parseInt(numbers[j],base);
                System.out.println(numbers[j]+ " base " + base + " = " + i );
            }
        }
        }catch (IndexOutOfBoundsException e1){
            System.out.println("\nIndex out of bound Exception: " + e1.getMessage());
        }catch (NumberFormatException e2){
            System.out.println("\nNumber Format Exception: " + e2.getMessage());
        }

        //es ist eigentlicht egal da die beide exceptions geprüft werden. Error wird zurückgegeben für was aufgetretten ist
    }

}
