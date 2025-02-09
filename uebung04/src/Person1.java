import java.io.Serializable;
public class Person1 implements Serializable {
    String name;
    Person2 person2;
    public Person1(String name) {
        this.name = name;
    }
}
