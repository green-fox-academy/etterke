import java.util.*;

public class Matchmaking {

    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches (ArrayList<String> x, ArrayList<String> y) {

        ArrayList<String> merged = new ArrayList();
        int minLength = Math.min(x.size(),y.size());

        for (int i = 0; i < minLength; i++) {
            merged.add(x.get(i));
            merged.add(y.get(i));
        }

        return merged;
    }
}
