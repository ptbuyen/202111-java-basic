package lab9_2;

    /*
    * Animal Racing by using inheritance
    * Animal: speed(random)
     */
public class TestAnimal {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        if (horse.getSpeed() >= tiger.getSpeed() && horse.getSpeed() >= dog.getSpeed())
            System.out.println("Winner is " + (horse.getClass().getSimpleName()) + ", with speed: " + horse.getSpeed());
        else if (tiger.getSpeed() >= horse.getSpeed() && tiger.getSpeed() >= dog.getSpeed())
            System.out.println("Winner is " + (tiger.getClass().getSimpleName()) + ", with speed: " + tiger.getSpeed());
        else if (dog.getSpeed() >= horse.getSpeed() && dog.getSpeed() >= tiger.getSpeed())
            System.out.println("Winner is " + (dog.getClass().getSimpleName()) + ", with speed: " + dog.getSpeed());
    }
}
