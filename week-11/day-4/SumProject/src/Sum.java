import java.util.ArrayList;

public class Sum {

  public int sumElements(ArrayList<Integer> numbers) {
    if (numbers == null) return 0;

    int result = 0;
    for (Integer number : numbers) {
      result += number;
    }
    return result;
  }
}
