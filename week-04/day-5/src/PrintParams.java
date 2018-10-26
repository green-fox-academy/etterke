public class PrintParams {

    public static void main(String[] args) {

        printParams("Momofuku", "noodle", "and" , "milk", "bar");

    }

    public static void printParams (String... words) {

        for (String words2 : words) {
            System.out.print(words2 + " ");
        }

        System.out.println();
    }

}
