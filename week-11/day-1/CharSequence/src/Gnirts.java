public class Gnirts implements CharSequence {

  private String word;

  public Gnirts(String word) {
    this.word = reverseWord(word);

  }

  private String reverseWord(String word) {
    String reversed = "";

    for (int i = word.length() -1; i >= 0 ; i--) {
      reversed = reversed + word.charAt(i);
    }
    return reversed;
  }

  @Override
  public int length() {
    return word.length();
  }

  @Override
  public char charAt(int index) {
    return word.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return word.subSequence(start, end);
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
