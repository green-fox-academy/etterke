import java.util.*;

public class Candyshop {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        sweets(arrayList);
    }

    public static void sweets(ArrayList sweeter) {
        sweeter.set(sweeter.indexOf(2), "Croissant");
        sweeter.set(sweeter.indexOf(false), "Ice Cream");

        for (Object candy : sweeter) {
            System.out.println(candy);
        }
    }
}
