package lab8;

import java.security.SecureRandom;

public class Dog {
    private final int MAX_SPEED = 60;
    private int speed;

    public Dog() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }

    public int getSpeed() {
        return speed;
    }
}
