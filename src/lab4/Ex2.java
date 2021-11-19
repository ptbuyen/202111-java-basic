package lab4;

import java.util.Scanner;

public class Ex2 {

    /*
    * Exercise 02
    * String myPassword = "password123";
    * Allow user to input maximum 3 times
    * */

    public static void main(String[] args) {

        String myPassword = "password123";
        int inputTimes = 1;
        final int MAX_TIMES = 3;

        while (inputTimes <= 3){
            System.out.print("Password: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            if (myPassword.equals(userInput)){
                System.out.println("Hooray!\n");
                break;
            } else {
                System.out.println("Wrong password!\n");
                inputTimes++;
            }
        }
        System.out.println("Good bye! See you next time.");
    }
}
