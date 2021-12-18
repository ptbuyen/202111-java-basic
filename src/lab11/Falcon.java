package lab11;

import java.security.SecureRandom;

public class Falcon extends Animal {

    private int speed;

    public Falcon() {
        this.speed = this.speed = new SecureRandom().nextInt(40 + 1);
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
