package lab4;

public class Ex3 {
    /*
    * Exercise 03
    * String myStr = "100 minutes";
    * NOT using REGEX, extract digit character from that String
    * Expected output: "100".
    * EX: "12345n678" -> "12345678"
    * */

    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] myCharacter = myStr.toCharArray();
        String outputStr = "";

        for (int index = 0; index < myCharacter.length; index++) {
            if (Character.isDigit(myCharacter[index])){
                outputStr += myCharacter[index];
            }
        }

        System.out.println(outputStr);
    }
}
