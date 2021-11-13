package lesson2;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        int userAge = scanner.nextInt();

        if (userAge < 18) {
            System.out.println("KHONG BAN!");
        } else if (userAge <= 55) {
            System.out.println("UNLIMITED");
        } else {
            System.out.println("2 CHAI!");
        }
    }
}
