public class String2 {

  public static void main(String[] args) {
    String text = "Xzxzxzxz";
    int textLength = text.length();
    String result = removeX(text, textLength);

    System.out.println(result);
  }
  private static String removeX(String text, int textLength) {
    if (textLength == 0) {
      return "";
    } else if (text.charAt(textLength - 1) == 'x') {
      return removeX(text, textLength - 1);
    } else {
      return removeX(text, textLength - 1) + text.charAt(textLength - 1);
    }
  }
}
