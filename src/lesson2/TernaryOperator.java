package lesson2;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNum = scanner.nextInt();

        String notificationStr = "";

        // Ternary Operator
        notificationStr = inputNum == 3 ? "You input the number 3!" : "That is not the number 3!";
        System.out.println(notificationStr);
    }
}
