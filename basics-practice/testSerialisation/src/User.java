import java.io.*;

public class User implements Serializable{
    String name;
    int age;
    String password;

    public User(){}

    public User(String name, int age, String password)
    {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public static void main(String[] args) {
        deserializeData();
    }

    public static void serializeData(){
        User user = new User("Kelvin",23,"password");

        try {
            FileOutputStream fileout = new FileOutputStream("user_data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);

            out.writeObject(user);
            System.out.println("User has been serialized");

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void deserializeData(){
        User user = null;
        try {
            FileInputStream fileIN = new FileInputStream("user_data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIN);
            user = (User) in.readObject(); // Deserialize the object
            in.close(); // Close the stream
            fileIN.close();
            System.out.println("Deserialized User Name: " + user.name);
            System.out.println("Deserialized User Age: " + user.age);
            System.out.println("Deserialized User Password: " + user.password);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
