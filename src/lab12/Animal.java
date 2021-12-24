package lab12;

import java.security.SecureRandom;

public abstract class Animal {

    private int speed;
    FlyAble flyAble;

    public Animal(int speed) {
        this.speed = new SecureRandom().nextInt(speed + 1);
    }

    public int getSpeed() {
        return speed;
    }

    public boolean performFly() {
        return flyAble.Fly();
    }
}
