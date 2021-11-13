package lab2;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        // User input array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int desiredArrayLength = scanner.nextInt();

        int[] myIntArray = new int[desiredArrayLength];
        for (int index = 0; index < myIntArray.length; index++) {
            System.out.print("Index " + index + " : ");
            myIntArray[index] = scanner.nextInt();
        }

        // Determined index of min value
        int minValue = myIntArray[0];
        int indexOfMinValue = 0;
        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] < minValue){
                minValue = myIntArray[index];
                indexOfMinValue = index;
            }
        }
        System.out.println("Index of min number: " + indexOfMinValue);

        // Determined index of max value
        int maxValue = myIntArray[0];
        int indexOfMaxValue = 0;
        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] > maxValue){
                maxValue = myIntArray[index];
                indexOfMaxValue = index;
            }
        }
        System.out.println("Index of max number: " + indexOfMaxValue);
    }
}
