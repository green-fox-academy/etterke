public class OddNumberAverageMatrix {

//  1. Write a function that takes a matrix containing numbers and returns the average of the odd numbers in the matrix.
//  e.g:
//  input: [
//      [1, 2],
//      [7, 6]
//      ]
//  result: 4

  public static void main(String[] args) {

    int[][] numbers = {{1, 2, 9},
                        {11, 6, 5}};

    System.out.println(avarageOfOddNumbers(numbers));
  }

  public static double avarageOfOddNumbers(int[][] numbers){
    int sumOfOddNumbers = 0;
    int count = 0;
    double averageOfOddNumbers = 0;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        if (numbers[i][j] % 2 == 1){
          count++;
          sumOfOddNumbers += numbers[i][j];
        }
      }
    }
    return averageOfOddNumbers = sumOfOddNumbers / count;
  }

}
