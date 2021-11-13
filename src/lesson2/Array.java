package lesson2;

public class Array {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5};
        int[] myEmptyArray = new int[5];

        // Read element value
        int myFirstNumber = myIntArray[0];
        System.out.println(myFirstNumber);

        // Update element value
        myIntArray[0] = 10;
        System.out.println(myIntArray[0]);

        // Traditional for
        for (int elementIndex = 0; elementIndex < myIntArray.length; elementIndex++) {
            System.out.println(myIntArray[elementIndex]);
        }

        // Even number array
        for (int elementIndex = 0; elementIndex < myIntArray.length; elementIndex++) {
            myIntArray[elementIndex] = myIntArray[elementIndex] * 2;
        }

        // Enhance for
        for (int elementValue : myIntArray) {
            System.out.println(elementValue);
        }
    }
}
