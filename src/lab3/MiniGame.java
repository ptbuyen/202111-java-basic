package lab3;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class MiniGame {

    public static void main(String[] args) {

        System.out.println("===========Awesome Game===========");
        System.out.println("1. Check even, odd number.");
        System.out.println("2. Guessing number.");
        System.out.println("0. Exit!");

        boolean isContinuing = true;
        int failTime = 0;

        Scanner scanner = new Scanner(System.in);

        while (isContinuing) {
            System.out.print("Your option: ");
            int userInput = scanner.nextInt();

            if (failTime == 3) {
                System.out.println("Exceed try times!");
                break;
            }

            switch (userInput) {
                case 1:
                    checkEvenOddNumber();
                    break;
                case 2:
                    guessingNumber();
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Wrong option! Please input again!");
                    failTime++;
                    break;
            }
        }
        System.out.println("Good bye. Have a nice day!");
    }

    private static void checkEvenOddNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number: ");
        int userInputNumber = scanner.nextInt();

        if (userInputNumber % 2 == 0) {
            System.out.println(userInputNumber + " is a even number!");
        } else {
            System.out.println(userInputNumber + " is an odd number!");
        }
    }

    private static void guessingNumber() {
        int tryTimes = 0;
        final int MAX_TRY_TIME = 3;

        int myArrayLength = 10;
        int[] myIntArray = new int[myArrayLength];
        for (int value = 0; value < myArrayLength; value++) {
            myIntArray[value] = value;
        }

        int randomIndex = new SecureRandom().nextInt(myArrayLength);
        int randomNumber = myIntArray[randomIndex];

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your number: ");
            int userInputNumber = scanner.nextInt();
            if (userInputNumber == randomNumber) {
                System.out.println("Hooray!");
                break;
            }
            tryTimes++;
        } while (tryTimes < MAX_TRY_TIME);

        System.out.println("See you next time!");
    }
}
