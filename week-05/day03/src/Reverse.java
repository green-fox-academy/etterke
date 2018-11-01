public class Reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        reverse(reversed);

    }

    private static void reverse(String text) {

        for(int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
