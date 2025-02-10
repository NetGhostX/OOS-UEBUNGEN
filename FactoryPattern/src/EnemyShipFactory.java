public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip = null;

        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };

    }
}
