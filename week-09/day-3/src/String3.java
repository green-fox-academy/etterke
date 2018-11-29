public class String3 {

  public static void main(String[] args) {
    String text = "Xzxzxzxz";
    int textLength = text.length();
    int lengthWithStars = text.length();
    String result = separateCharacters(text, textLength, lengthWithStars);

    System.out.println(result);
  }

  private static String separateCharacters(String text, int textLength, int lengthWithStars) {
    if (textLength == 0) {
      return "";
    } else if (textLength == lengthWithStars) {
      return separateCharacters(text, textLength - 1, lengthWithStars) + text.charAt(textLength - 1);
    } else {
      return separateCharacters(text, textLength - 1, lengthWithStars) + text.charAt(textLength - 1) + '*';
    }
  }
}
