public class Cat extends Animal {

  private static int randomHealCost = (int) (Math.random() * 6);

  public Cat() {
    this.setName("Cat");
    this.setHealCost(randomHealCost);
  }

  public Cat(String name) {
    super(name);
    this.setHealCost(randomHealCost);
  }
}
