import java.io.*;

public class D extends C implements Serializable {
    int d = 4;
    void setD(int d){
        this.d = d;
    }

    @Override
    public String toString() {
        return(a + "," + b + "," + c +"," + d) ;
    }

    public static void main(String[] args) {
        D d = new D();
        d.a = 10;
        d.b = 20;
        d.c = 30;
        d.d = 40;

        try{
            FileOutputStream fileIn = new FileOutputStream("class_D.ser");
            ObjectOutputStream in = new ObjectOutputStream(fileIn);
            in.writeObject(d);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        deserialize();
    }

    public static void deserialize(){
        try {
            FileInputStream fileIn = new FileInputStream("class_D.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            D new_D = (D) in.readObject();

            System.out.println(new_D);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
