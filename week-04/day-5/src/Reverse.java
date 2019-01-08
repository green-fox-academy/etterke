import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6 ,7};
        int[] reverse = new int[aj.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = aj[aj.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
