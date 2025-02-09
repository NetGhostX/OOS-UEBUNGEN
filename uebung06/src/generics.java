import java.util.ArrayList;
import java.util.Random;

public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            Random rand = new Random();
            numbers.add(rand.nextInt(10));
        }
        System.out.println("Using for each to output numbers in console");
        System.out.println(numbers.toString());
        System.out.println();

        numbers.forEach(System.out::println);

        System.out.println("Incrementing each number by 1");

        numbers.forEach(number->{int increased = number +1;
            System.out.println(increased);});

    }
}
