public class SubString {

  public static void main(String[] args) {

    //  Create a function that takes two strings as a parameter

    String first = "The rain in Spain";
    String second = "Spain";
    String third = "sunshine";

    System.out.println(subStr(first, second));
    System.out.println(subStr(first, third));
  }

  public static int subStr(String input, String q) {

    int indexOfSubstring = input.indexOf(q);

    if (input.contains(q)) {
      return indexOfSubstring;
    } else {
      return -1;
    }
  }

}
