
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Kelvin";
        user.password = "password";

        FileOutputStream fos = new FileOutputStream("./User.ser");
        ObjectOutputStream oos= new ObjectOutputStream(fos);

        oos.writeObject(user);
        oos.close();
        fos.close();

        System.out.println("User saved to file");

    }
}
