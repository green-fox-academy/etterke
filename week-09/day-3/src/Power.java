public class Power {

  public static void main(String[] args) {
    int base = 3;
    int power = 2;

    int result = powerN(base, power);
    System.out.println(result);
  }

  public static int powerN(int base, int n) {
    if (n != 0) {
      return base * powerN(base, (n-1));
    } else {
      return 1;
    }
  }
}
