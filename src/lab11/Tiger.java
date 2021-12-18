package lab11;

import java.security.SecureRandom;

public class Tiger extends Animal{

    private int speed;

    public Tiger() {
        this.speed = this.speed = new SecureRandom().nextInt(100 + 1);
    }

    @Override
    protected int speed() {
        return this.speed;
    }

    @Override
    protected boolean flyable() {
        return false;
    }
}
