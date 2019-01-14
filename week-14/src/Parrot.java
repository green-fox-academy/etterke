public class Parrot extends Animal {

  private static int randomHealCost = 4 + (int) (Math.random() * 7);

  public Parrot() {
    this.setName("Parrot");
    this.setHealCost(randomHealCost);
  }

  public Parrot(String name) {
    super(name);
    this.setHealCost(randomHealCost);
  }
}
