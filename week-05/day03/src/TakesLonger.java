public class TakesLonger {

    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        int index1 = quote.indexOf("It");
        int index2 = quote.indexOf("you");

        System.out.println(index1 + " " + index2);

        String extendedQuote = quote.substring(0, (index1 + 3)) + "always takes longer than " + quote.substring(index2);

        System.out.println(extendedQuote);

    }
}
