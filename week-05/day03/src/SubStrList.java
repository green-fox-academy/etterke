import java.util.ArrayList;
import java.util.Arrays;

public class SubStrList {

    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        //  Example
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(subStrList("hat", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
    }

    public static int subStrList(String text, String[] stringArray) {

        for (int i = 0; i <stringArray.length ; i++) {
            if (stringArray[i].indexOf(text) >= 0) {
                return i;
            }
        }
        return -1;
    }
}