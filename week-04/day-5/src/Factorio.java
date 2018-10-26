public class Factorio {

    public static void main(String[] args) {

        int number = 7;
        int factorial = factorio(number);

        System.out.println("The input's factorial is: " + factorial);

    }

    public static int factorio (int n1) {

        int factorio1 = 1;

        for (int i = 1; i <= n1; i++) {
            factorio1 = factorio1 * i;

        }

        return factorio1;

    }
}
