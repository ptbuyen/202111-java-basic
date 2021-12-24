package lab11;

/*
 * Resolve Animal Racing with ABSTRACTION and we add flyAble field:
 * Horse: Max 75 km/h !flyAble
 * Tiger: Max 100 Km/h !flyAble
 * Dog: Max 60 KM/h !flyAble
 * Falcon: Max 40KM/H flyAble
 * Eagle: Max 60KM/H flyAble
 * */

import lesson2.Array;

import java.util.Arrays;
import java.util.List;

public class TestAnimalRacing {

    public static int MAX_HORSE_SPEED = 75;
    public static int MAX_TIGER_SPEED = 100;
    public static int MAX_DOG_SPEED = 60;
    public static int MAX_FALCON_SPEED = 40;
    public static int MAX_EAGLE_SPEED = 60;

    public static void main(String[] args) {
        Animal horse = new Horse(MAX_HORSE_SPEED);
        Animal tiger = new Tiger(MAX_TIGER_SPEED);
        Animal dog = new Dog(MAX_DOG_SPEED);
        Animal falcon = new Falcon(MAX_FALCON_SPEED);
        Animal eagle = new Eagle(MAX_EAGLE_SPEED);

        List<Animal> animalList = Arrays.asList(horse, tiger, dog, falcon, eagle);
        int maxSpeed = 0;
        String winnerAnimal = "";

        for (Animal animal : animalList) {
            if (!animal.flyable() && animal.getSpeed() >= maxSpeed){
                maxSpeed = animal.getSpeed();
                winnerAnimal = animal.getClass().getSimpleName();
            }
        }

        System.out.println("Winner is " + winnerAnimal + ", with speed: " + maxSpeed);
    }
}
