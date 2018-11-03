import java.util.*;

public class AppendLetter {

    public static void main(String[] args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));

    }

    public static List<String> appendA(List x) {

        ArrayList<String> farA = new ArrayList();

        for (int i = 0; i < x.size(); i++) {
            farA.add(x.get(i) + "a");
        }

        return farA;
    }
}
