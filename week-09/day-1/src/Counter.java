public class Counter {

  public static void main(String[] args) {
    countDownFromNumber(10);

  }

  public static void countDownFromNumber (int n) {
    if (n >= 0) {
      countDownFromNumber(n -1);
    }
    System.out.println(n);
  }
}
