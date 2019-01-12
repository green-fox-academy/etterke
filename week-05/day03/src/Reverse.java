public class Reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        StringBuilder corrected = new StringBuilder(reversed);

        System.out.println(corrected.reverse().toString());
        System.out.println(reverse(reversed));

    }

    public static String reverse(String text){
        char[] reversedLetters = text.toCharArray();
        char[] correctLetters = new char[reversedLetters.length];
        for (int i = 0; i < reversedLetters.length; i++) {
            System.arraycopy(reversedLetters, (reversedLetters.length - 1 - i), correctLetters, i, 1);
        }
        String correct = new String(correctLetters);
        return correct;
    }


}
