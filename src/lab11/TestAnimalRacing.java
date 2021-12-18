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

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal falcon = new Falcon();
        Animal eagle = new Eagle();

        List<Animal> animalList = Arrays.asList(horse, tiger, dog, falcon, eagle);
        int maxSpeed = 0;
        String winnerAnimal = "";

        for (Animal animal : animalList) {
            if (!animal.flyable() && animal.speed() >= maxSpeed){
                maxSpeed = animal.speed();
                winnerAnimal = animal.getClass().getSimpleName();
            }
        }

        System.out.println("Winner is " + winnerAnimal + ", with speed: " + maxSpeed);
    }
}
