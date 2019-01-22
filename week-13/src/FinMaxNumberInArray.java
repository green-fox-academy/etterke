public class FinMaxNumberInArray {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 45, 765, 23445, 98, 12765, 9875982, 45, 75676, 85};

    System.out.println(findBiggestNumber(numbers));
  }

  public static int findBiggestNumber(int[] numbers){
    int max = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] > max){
        max = numbers[i];
      }
    }
    return max;
  }
}
