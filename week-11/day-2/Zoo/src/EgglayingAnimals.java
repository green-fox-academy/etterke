public abstract class EgglayingAnimals extends Animal {

  public EgglayingAnimals(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
