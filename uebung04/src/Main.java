import java.io.*;
public class Main {
    public static void main(String[] args) {
        Person1 person01 = new Person1("Kelvin");

        try{
            FileOutputStream fileOut = new FileOutputStream("person01.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(person01);

            System.out.println("Person01 object has been serialized");
        }catch(IOException e){
            System.out.println("\n Error occurred: " +e.getMessage());
        }
    }
}
