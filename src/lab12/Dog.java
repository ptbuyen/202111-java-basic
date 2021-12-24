package lab12;

public class Dog extends Animal {

    public Dog(int maxSpeed) {
        super(maxSpeed);
        flyAble = new CannotFly();
    }
}
