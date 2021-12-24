package lab12;

public class Tiger extends Animal {

    public Tiger(int maxSpeed) {
        super(maxSpeed);
        flyAble = new CannotFly();
    }
}
