public class Human {
    private String name;
    private int age;

    public Human( int age, String name){
        this.name =name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + "Human: " + this.name + "\n Age: " + this.age;
    }
}

