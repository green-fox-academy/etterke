public class CounterMain {

  public static void main(String[] args) {

    Counter myCounter = new Counter();

    myCounter.add(10);
    myCounter.add();
    myCounter.add(28);
    System.out.println(myCounter.get());
    myCounter.reset();
    System.out.println(myCounter.get());
  }
}
