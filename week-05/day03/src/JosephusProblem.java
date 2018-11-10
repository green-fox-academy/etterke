import java.util.Scanner;
import java.util.*;

public class JosephusProblem {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Let's solve this Josephus Problem. Put in a number to represent the number of participants in this mission: ");
        int participants = number.nextInt();
        int[] participantsArray = new int[participants];
        System.out.println("The number of participants is: " + participantsArray.length);

        for (int i = 0; i < participantsArray.length; i++) {
            participantsArray[i] = i + 1;
        }

        ArrayList <Integer> participantsArrayList = new ArrayList<>();

        for (int k = 0; k < participantsArray.length; k++) {
            participantsArrayList.add(participantsArray[k]);
        }

        int indexToRemove = 1;
        Integer indexToRemoveInteger = new Integer (indexToRemove);

        while (participantsArrayList.size() > 1) {
            participantsArrayList.remove(indexToRemove);
            indexToRemoveInteger = indexToRemoveInteger + indexToRemove % participantsArrayList.size();
        }
        System.out.println("The last one to stay alive is: " + participantsArrayList);
    }
}
