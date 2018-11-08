import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {

    public static void main(String[] args) {
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    }

    public static ArrayList<Integer> subInt(int num, int[] numArray) {
        ArrayList<Integer> result = new ArrayList<>();
        String numArrayString = String.valueOf(num);
        for (int i = 0; i < numArray.length; i++) {
            if (String.valueOf(numArray[i]).contains(numArrayString)) {
            result.add(i);
            }
        }
        return result;
    }
}
