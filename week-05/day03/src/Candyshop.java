import java.util.*;

public class Candyshop {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

    public static ArrayList sweets(ArrayList sweeter) {
        sweeter.set(sweeter.indexOf(2), "Croissant");
        sweeter.set(sweeter.indexOf(false), "Ice Cream");

        return sweeter;
    }
}
