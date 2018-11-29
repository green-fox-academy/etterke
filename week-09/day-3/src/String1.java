public class String1 {

  public static void main(String[] args) {
    String text = "Xzxzxzxz";
    int textLength = text.length();
    String result = replaceX(text, textLength);

    System.out.println(result);
  }

  private static String replaceX(String text, int textLength) {
    if (textLength == 0) {
      return "";
    } else if (text.charAt(textLength - 1) != 'x') {
      return replaceX(text, textLength - 1) + text.charAt(textLength - 1);
    } else {
      return replaceX(text, textLength - 1) + 'y';
    }
  }
}
