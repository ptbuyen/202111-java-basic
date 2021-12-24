package lab11;

public class Falcon extends Animal {

    public Falcon(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    protected boolean flyable() {
        return true;
    }
}
