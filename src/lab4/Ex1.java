package lab4;

public class Ex1 {
    /*
     * Exercise 01
     * Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
     * */

    public static void main(String[] args) {

        String inputStr = "2hrs and 5 minutes";

        // Get hour
        String hourStr = inputStr.substring(0, inputStr.indexOf("hrs"));
        int hourNum = Integer.parseInt(hourStr);

        // Get minutes
        String minutesStr = inputStr.substring(inputStr.indexOf("and ") + 4, inputStr.indexOf(" minutes"));
        int minutesNum = Integer.parseInt(minutesStr);

        // Calculate total minutes
        int totalMinutes = hourNum * 60 + minutesNum;

        System.out.println("Total minutes is " + totalMinutes);
    }
}
