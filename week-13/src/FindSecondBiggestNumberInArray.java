public class FindSecondBiggestNumberInArray {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 45, 765, 23445, 98, 12765, 9875982, 45, 75676, 85};

    System.out.println(findSecondBiggestNumber(numbers));

//    System.out.println(findSecondBiggestNumberInArray(numbers));
  }

  public static int findSecondBiggestNumber(int[] numbers) {
    int biggest = numbers[0];
    int secondBiggest = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i] > biggest) {
        secondBiggest = biggest;
        biggest = numbers[i];
      } else if (numbers[i] > secondBiggest){
        secondBiggest = numbers[i];
      }
    }
    return biggest;
  }


//  private static int findSecondBiggestNumberInArray(int[] numbers) {
//    int max = numbers[0];
//    int secondmax = numbers[0];
//
//    for (int i = 0; i < numbers.length; i++) {
//      if(numbers[i] > max){
//        secondmax = max;
//        max = numbers[i];
//      } else if(numbers[i] > secondmax){
//        secondmax = numbers[i];
//      }
//    }
//    return secondmax;
//  }


}
