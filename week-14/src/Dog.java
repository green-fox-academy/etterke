public class Dog extends Animal {

  private static int randomHealCost = 1 + (int) (Math.random() * 8);

  public Dog() {
    this.setName("Dog");
    this.setHealCost(randomHealCost);
  }

  public Dog(String name) {
    super(name);
    this.setHealCost(randomHealCost);
  }
}
