public class FindSecondBiggestNumberInArray {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 45, 765, 23445, 98, 12765, 9875982, 45, 75676, 85};

    System.out.println(findSecondBiggestNumberInArray(numbers));
  }

  private static int findSecondBiggestNumberInArray(int[] numbers) {
    int max = numbers[0];
    int secondmax = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] > max){
        secondmax = max;
        max = numbers[i];
      } else if(numbers[i] > secondmax){
        secondmax = numbers[i];
      }
    }
    return secondmax;
  }


}
