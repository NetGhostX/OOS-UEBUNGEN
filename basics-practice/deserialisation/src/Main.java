import java.io.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();

        FileInputStream fis = new FileInputStream("User.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        user = (User) ois.readObject();
        in.close();
        fis.close();


        System.out.println(user.name);
    }
}
