public class Bunnies {

  public static void main(String[] args) {

    int bunnies = 5;
    int ears = 2;
    int result = calculateNumberOfEars(bunnies, ears);

    System.out.println(result);
  }

  private static int calculateNumberOfEars(int bunnies, int ears) {
    if (bunnies == 0) {
      return 0;
    } else {
      return ears + calculateNumberOfEars((bunnies-1), ears);
    }
  }
}
