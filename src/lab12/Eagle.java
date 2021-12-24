package lab12;

public class Eagle extends Animal {

    public Eagle(int maxSpeed) {
        super(maxSpeed);
        flyAble = new CanFly();
    }
}
