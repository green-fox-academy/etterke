public class Shifter implements CharSequence {

  private String word;
  private int charsToShift;

  public Shifter(String word, int charsToShift) {
    this.word = word;
    this.charsToShift = shiftCharacters(charsToShift);
  }

  private int shiftCharacters(int index) {
    index +=charsToShift;

    return index;
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

  public int getCharsToShift() {
    return charsToShift;
  }

  public void setCharsToShift(int charsToShift) {
    this.charsToShift = charsToShift;
  }
}
