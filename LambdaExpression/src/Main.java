public class Main {
    public static void main(String[] args) {

        String name = "Kelvin";
        Myinterface myInterface = (x) ->{
            System.out.println("Hello " + name);
        };

        myInterface.message(name);
    }


}
