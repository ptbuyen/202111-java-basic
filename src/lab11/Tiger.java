package lab11;

public class Tiger extends Animal{

    public Tiger(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    protected boolean flyable() {
        return false;
    }
}
