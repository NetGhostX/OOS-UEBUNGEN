public abstract class EnemyShip {
    private String name; 
    private double amountOfDamage;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setAmountOfDamage(double amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }

    public double getAmountOfDamage() {
        return amountOfDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }
    public void displayEnemyShip() {
        System.out.println(getName() + " is following the hero");
    }
    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + this.getAmountOfDamage());
    }
}
