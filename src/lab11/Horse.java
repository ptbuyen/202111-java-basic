package lab11;

public class Horse extends Animal {

    public Horse(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    protected boolean flyable() {
        return false;
    }
}
