import java.util.*;

public class QuoteSwap {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        quoteSwap(list);
    }

    public static void quoteSwap (ArrayList swappy) {

        swappy.set(2, "cannot");
        swappy.set(5, "do");

        for (Object quote : swappy) {
            System.out.print(quote + " ");
        }
    }
}
