import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class UserLogin {
    public static void main(String[] args) {
        String name = "Kelvin";
        int age = 23;
        String password = "motherfuckingpassword";
        Date dateofRegistery = new Date();

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("data.txt"));
            writer.write("Username: " + name + "\n");
            writer.write("Age of user: " + age + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("Date of registration: " + dateofRegistery.toString() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (writer != null) {
                    writer.close(); // Ensure the writer is closed
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
