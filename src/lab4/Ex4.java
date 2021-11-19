package lab4;

public class Ex4 {
    /*
    * Exercise 04
    * String url = "https://google.com";
    * Check http OR https; domain name, .com OR .net
    * */

    public static void main(String[] args) {
        String url = "https://google.com";

        String myUrlProtocol = url.substring(0, url.indexOf("://"));
        String myUrlDomain = url.substring(url.indexOf("."), url.length());

        System.out.println("Url protocol: " + myUrlProtocol);
        System.out.println("Url domain: " + myUrlDomain);
    }
}
