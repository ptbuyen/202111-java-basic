package lab11;

import java.security.SecureRandom;

public abstract class Animal {

    private int speed;

    public Animal(int speed) {
        this.speed = new SecureRandom().nextInt(speed + 1);;
    }

    protected abstract boolean flyable();

    public int getSpeed() {
        return speed;
    }
}
