public class SumOfEverySecondNumberMatrix {

//  2. Write a function that takes a matrix containing numbers and returns the sum of every second number in each row.
//  e.g:
//  input: [
//      [2, 4, 5, 7],
//      [1, 5, 9, 2],
//      [3, 6, 3, 5],
//      [8, 2, 1, 7],
//      ]
//  result: 38 (4+7+5+2+6+5+2+7)
//
//  input2: [
//      [2, 4, 5],
//      [1, 5, 9],
//      [3, 6, 3],
//      ]
//  result2: 15 (4+5+6)

  public static void main(String[] args) {

    int[][] numbers = {{2, 4, 5, 7}, {1, 5, 9, 2}, {3, 6, 3, 5}, {8, 2, 1, 7}};


    System.out.println(sumEverySecondNumber(numbers));
  }

  private static int sumEverySecondNumber(int[][] numbers) {
    int sumOfEverySecNumber = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length - 1; j+=2) {
        sumOfEverySecNumber += numbers[i][j + 1];
      }
    }
    return sumOfEverySecNumber;
  }
}
