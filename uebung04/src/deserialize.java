import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person1 person1;
        FileInputStream fileIn = new FileInputStream("person01.ser");
        ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
        person1 = (Person1) ObjectIn.readObject();
        fileIn.close();
        ObjectIn.close();
        System.out.println(person1.name);
    }
}
