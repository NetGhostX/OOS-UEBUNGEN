import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class  Sorting {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human( 23, "Kelvin"));

        humans.add(new Human( 22, "Mohannad"));

        humans.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
             return o1.getName().compareTo(o2.getName());
            }
        });

     //   humans.forEach(member-> System.out.println(member));
        for(Human h : humans){
            System.out.println(h);
        }
    }

}
