package lab11;

import java.security.SecureRandom;

public class Eagle extends Animal {

    private int speed;

    public Eagle() {
        this.speed = this.speed = new SecureRandom().nextInt(60 + 1);
    }

    @Override
    protected int speed() {
        return this.speed;
    }

    @Override
    protected boolean flyable() {
        return true;
    }
}
