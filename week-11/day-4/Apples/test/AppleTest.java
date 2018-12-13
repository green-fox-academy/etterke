import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void getAppleTest() {
    Apple apple = new Apple();
    String expectedOutcome = "apple";

    String result = apple.getApple();

    assertEquals(expectedOutcome, result);
  }
}