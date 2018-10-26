public class PrintParams {

    public static void main(String[] args) {

        String input1 = "Ecc-pecc";
        String input2 = "Kimehetsz";
        String input3 = "Holnaputan";
        String input4 = "Bejohetsz";

        printParams(input1, input2, input3, input4);

    }

    public static void printParams (String text1, String text2, String text3, String text4) {

        System.out.print(text1 + " ");
        System.out.print(text2 + " ");
        System.out.print(text3 + " ");
        System.out.print(text4);
    }

}
