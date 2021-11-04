package lesson1;

public class VariableLearning {

    public static void main(String[] args) {
        int myIntNum = 1;
        float myFloatNum = 2f;
        double myDoubleNum = 4.6e3;
        char c = 'a';
        boolean amIFalse = true;

        int num1 = 1;
        int num2 = 2;

        boolean isNum1LessThanNum2 = num1 < num2;
        boolean isNum2LessThanNum1 = num2 < num1;

        System.out.println("\t" + isNum1LessThanNum2);
        System.out.println("\t" + isNum2LessThanNum1);

        System.out.printf("Number 1 is: %d and my number 2: is %d\n", num1, num2);
        System.out.printf("My float number is: %f", myFloatNum);

    }
}
