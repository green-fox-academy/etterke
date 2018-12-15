import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  public static Anagram anagram;

  @BeforeClass
  public static void init() {
    anagram = new Anagram();
  }

  @Test
  public void testIfAnagram() {
    String s1 = "greenfox";
    String s2 = "foxgreen";

    boolean result = anagram.isAnagram(s1, s2);

    assertTrue(result);
  }

  @Test
  public void testWithDifferentWordLength() {
    String s1 = "greenfox";
    String s2 = "greenfoxgreenfox";

    boolean result = anagram.isAnagram(s1, s2);

    assertFalse(result);
  }

  @Test
  public void testWithSameLengthDifferentLetters() {
    String s1 = "greenfox";
    String s2 = "browndog";

    boolean result = anagram.isAnagram(s1, s2);

    assertFalse(result);
  }

  @Test
  public void testWithNull() {
    String s1 = null;
    String s2 = null;

    boolean result = anagram.isAnagram(s1, s2);

    assertFalse(result);
  }

  @Test
  public void testWithEmptyStrings() {
    String s1 = "";
    String s2 = "";

    boolean result = anagram.isAnagram(s1, s2);

    assertTrue(result);
  }

}