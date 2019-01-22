public class DrawTriangle {


  public static void main(String[] args) {

    int number = 3;

    printMatrix(number);
  }

  public static void printMatrix(int number) {
    String[][] board = new String[number][5];
    String[][] stars = new String[number][5];
    String[][] resultMatrix = new String[number][5];

    String star = "*";

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < 5; j++) {
        if (board[i][j] == stars[i][j]) {
          resultMatrix[i][j] = star;
        }
      }
    }

    for (String[] row : resultMatrix) {
      for (String element : row) {
        System.out.print(element + ", ");
      }
      System.out.println();
    }
  }
}

