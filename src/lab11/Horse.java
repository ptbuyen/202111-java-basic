package lab11;

import java.security.SecureRandom;

public class Horse extends Animal {

    private int speed;

    public Horse() {
        this.speed = this.speed = new SecureRandom().nextInt(75 + 1);
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
