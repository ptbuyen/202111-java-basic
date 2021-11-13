package lesson2;

public class ForLoop {

    public static void main(String[] args) {

        int currentNumber = 0;
        for (; currentNumber < 10; currentNumber++) {
            System.out.println(currentNumber);
        }

        System.out.println(currentNumber);
        System.out.println("Out of the for loop");
    }
}
