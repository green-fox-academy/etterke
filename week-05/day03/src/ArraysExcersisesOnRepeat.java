import java.util.*;

public class ArraysExcersisesOnRepeat {

    public static void main(String[] args) {

        ArrayList<Integer> q = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        System.out.println(q.get(2));

        ArrayList<Integer> p1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> p2 = new ArrayList<>(Arrays.asList(4, 5));
        if (p2.size() > p1.size()) {
            System.out.println("p2 has more elements than p1");
        } else {
            System.out.println("p1 has more elements than p2");
        }

        ArrayList<Integer> r = new ArrayList<>(Arrays.asList(54, 23, 66,12));
        System.out.println(r.get(1) + r.get(2));

        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 5, 6));
        s.set(3, 4);
        System.out.println(s.get(3));

        ArrayList<Integer> t = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        t.set(2, t.get(2) + 1);
        System.out.println(t.get(2));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        System.out.println(numbers);

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            doubleList.add(i, (numList.get(i) * 2));
        }
        System.out.println(doubleList);

        ArrayList<String> abc = new ArrayList<>(Arrays.asList("first", "second", "third"));
        String swap = abc.get(2);
        abc.set(2, abc.get(0));
        abc.set(0, swap);
        System.out.println(abc);

    }
}
