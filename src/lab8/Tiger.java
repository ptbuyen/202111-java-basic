package lab8;

import java.security.SecureRandom;

public class Tiger { ;
    private final int MAX_SPEED = 100;
    private int speed;

    public Tiger() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }

    public int getSpeed() {
        return speed;
    }
}
