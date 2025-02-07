import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char c = 'h';
        int d = c;  // type conversion can be performed implicitly however not all information are retained.
        System.out.println(d);

        //impliziter Typecast 1/2

        long x = 5;
        int y = 3;

        x = y; //impliziter Cast von int nach long

        System.out.println(x);

        int a = 2502;
        System.out.println("Wert = " + a);  //funktioniert nicht bei selbstgeschriebenen Funktionen´

        //Expliziter Typecast

        short s = (short) 23343445;
        System.out.println("valus of s is: " + s); //returns 12629 instead of the actual value above--> lost some data while converting


        int z = 234234234;
        short w = (short) z;

        System.out.println("Convertion from int to short. z: " + w); // lost data while converting from int to short. --> Eingeschränkt

        float number = 324234233;

        long  l = (long) number;

        System.out.println(number);

        short t = 3;
        t= (short) (t+1);

        System.out.println(t);


        int g = 4;
        int i = g + ++g;
        System.out.println( "Solution for i: " + i);
        System.out.println("Solution for g: " +g);


    }
}