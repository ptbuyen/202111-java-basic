package lab9_2;

import java.security.SecureRandom;

public class Animal {

    protected int speed;

    public Animal(int speed) {
        this.speed = new SecureRandom().nextInt(speed + 1);
    }

    public int getSpeed() {
        return speed;
    }
}
