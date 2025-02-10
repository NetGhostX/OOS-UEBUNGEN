public class Adapter implements ToyDuck {
    Bird01 bird;
    public Adapter(Bird01 bird){
        this.bird = bird;
    }

    /**
     *
     */
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
