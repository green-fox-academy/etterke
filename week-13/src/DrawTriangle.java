public class DrawTriangle {


  public static void main(String[] args) {

    int height = 9;

    String star = "*,";
    String space = "_,";

    for (int i = 0; i < height; i++) {
      for (int j = 0; j > i; j++) {
        if(i == j) {
          System.out.print(star);
        } else {
          System.out.print(space);
        }
      }
      System.out.println();
    }
  }
}
