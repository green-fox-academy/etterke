import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  private static Sum sum;

  @BeforeClass
  public static void init() {
    sum = new Sum();
  }

  @Test
  public void testSumElements() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    int expectedResult = 21;

    int resultSumElements = sum.sumElements(numbers);

    assertEquals(resultSumElements, expectedResult);
  }

  @Test
  public void testSumElementsWithEmptyList() {
    ArrayList<Integer> emptyList = new ArrayList<>(Arrays.asList());
    int expectedEmptyResult = 0;

    int resultSumElementsWithEmptyList = sum.sumElements(emptyList);

    assertEquals(resultSumElementsWithEmptyList, expectedEmptyResult);
  }

  @Test
  public void testSumElementsWithOneElement() {
    ArrayList<Integer>  oneElement = new ArrayList<>(Arrays.asList(5));
    int expectedOneElementResult = 5;

    int resultWithOneElement = sum.sumElements(oneElement);

    assertEquals(resultWithOneElement, expectedOneElementResult);
  }

  @Test
  public void testNullList() {
    ArrayList<Integer> nullList = null;
    int expectedNullList = 0;

    int resultWithNullList = sum.sumElements(nullList);

    assertEquals(resultWithNullList, expectedNullList);
  }
}
