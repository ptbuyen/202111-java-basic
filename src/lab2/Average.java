package lab2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

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

        // Determined average value
        double sum = 0;
        for (int index = 0; index < myIntArray.length; index++) {
            sum += myIntArray[index];
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setRoundingMode(RoundingMode.UP);

        double averageValue = sum / desiredArrayLength;
        System.out.println("Average value from the array: " + decimalFormat.format(averageValue));
    }
}
