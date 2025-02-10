import java.util.Random;
public class EnemyRobot {
    Random rand = new Random();
    public void smashWithHands(){
        int attackDamage = rand.nextInt(10)+1;
        System.out.println("Enemy Robot causes: " + attackDamage + "Damage with is Hands");
    }

    public void walkForward(){
        int movement = rand.nextInt(10)+1;

        System.out.println("Enemy Robot walks forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}


