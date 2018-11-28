public class Bunnies2 {

  public static void main(String[] args) {
    int bunnies = 6;
    int result = countNumberOfEars (bunnies);

    System.out.println(result);
  }

  private static int countNumberOfEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else if (bunnies % 2 == 0){
      return 3 + countNumberOfEars(bunnies - 1);
    } else {
      return 2 + countNumberOfEars(bunnies - 1);
    }
  }

}
