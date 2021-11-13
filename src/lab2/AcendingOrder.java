package lab2;

public class AcendingOrder {

    public static void main(String[] args) {

        int[] myIntArray = {9, 3, 6, 4, 1, 9, 8, 2, 3};

        int tempValue;
        int minValue;
        int indexOfMinValue;

        for (int indexStart = 0; indexStart < myIntArray.length; indexStart++) {
            minValue = myIntArray[indexStart];
            indexOfMinValue = indexStart;

            for (int index = indexStart; index < myIntArray.length; index++) {
                if (myIntArray[index] < minValue){
                    minValue = myIntArray[index];
                    indexOfMinValue = index;
                }
            }

            tempValue = myIntArray[indexStart];
            myIntArray[indexStart] = myIntArray[indexOfMinValue];
            myIntArray[indexOfMinValue] = tempValue;
        }

        System.out.println("Ascending Order: ");
        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}
