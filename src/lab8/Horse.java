package lab8;

import java.security.SecureRandom;

public class Horse {
    private final int MAX_SPEED = 75;
    private int speed;

    public Horse() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }

    public int getSpeed() {
        return speed;
    }
}
