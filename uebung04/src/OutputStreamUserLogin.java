
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class OutputStreamUserLogin {
    public static void main(String[] args) {
        int bank_accountBalance = 324243244;
        String name = "Kelvin";
        Date date = new Date();

        try{
            FileOutputStream fileOut = new FileOutputStream("bank_data.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeInt(bank_accountBalance);
            out.writeObject("Account owner's name: " + name);
            out.writeObject("Last logged in: " + date);
        } catch (IOException e) {
            System.out.printf("Error: " + e.getMessage());
        }
    }
}
