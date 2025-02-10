public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        doStuffEnemy(shipFactory.makeEnemyShip("B"));
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
