public class Counter {

  int basis;

  public Counter() {
    this.basis = 0;
  }

  public void add(int number) {
    basis += number;
  }

  public void add() {
    basis++;
  }

  public int get() {
    return basis;
  }

  public void reset(){
    basis = 0;
  }


}
