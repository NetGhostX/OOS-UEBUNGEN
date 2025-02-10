import java.awt.*;

public class TestEnemyAttackers {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();

        EnemyRobot robot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);

        System.out.println("The Robot");

        robot.reactToHuman("Paul");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println();


        System.out.println("The enemy Tank");

        tank.assignDriver("Test1");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println();

        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("ThisGuy");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
