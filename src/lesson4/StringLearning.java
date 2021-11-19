package lesson4;

public class StringLearning {

    public static void main(String[] args) {

        String s1 = "Cat"; // string pool
        String s2 = "Cat"; // string pool
        System.out.println((s1 == s2)); // be same

        String s3 = new String("Cat");
        System.out.println((s1 == s3)); // different
        System.out.println(s1.equals(s3)); // be same - should use "equal" for string

        // lower cases, upper cases, number
        String myPassword = "123Password";
        char[] myCharacter = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCases = 0;
        int totalUpperCases = 0;

        for (char character : myCharacter) {
            if (Character.isDigit(character))
                totalDigits++;
            if (Character.isLowerCase(character))
                totalLowerCases++;
            if (Character.isUpperCase(character))
                totalUpperCases++;
        }

        if (totalDigits > 0 && totalLowerCases > 0 && totalUpperCases > 0) {
            System.out.println("You are all set!");
        } else {
            System.out.println("Password is not matches the pattern!");
        }

        // Replacement
        String badWordsContain = " bad, very bad, ....   ";
        String filterStr = badWordsContain.trim().replace("bad", "***");
        System.out.println(filterStr);

        // sub-str, index, split
        String myUrl = "https://sdetpro.com";
        String[] myUrlSplitResult = myUrl.split("");

        String[] myUrlParts = myUrl.split("://");
        for (String s : myUrlParts) {
            System.out.println(s);
        }

        System.out.println(myUrl.indexOf("a"));
        System.out.println(myUrl.indexOf("o"));
        System.out.println(myUrl.substring(myUrl.indexOf("sdetpro"), myUrl.indexOf(".")));

        // Concatenation
        String hello = "Hello ";
        String word = "word!";
        System.out.println(hello.concat(word));

        int[] myIntArr = {5, 10, 15, 20, 25};
        for (int index = 0; index < myIntArr.length; index++) {
            System.out.println("My element number " + (index + 1) + " is " + myIntArr[index]);
        }

        // Regex - Regular Expression
        /*
         * item price: 999 vnd
         * tax: 99 vnd
         * total: 1098 vnd
         * */

        String totalPriceStr = "1098 vnd";
        String totalPriceNumStr = totalPriceStr.replaceAll("[^0-9]", "");
        int totalPriceNum = Integer.parseInt(totalPriceNumStr);
        System.out.println(totalPriceNum + 1);

    }
}
