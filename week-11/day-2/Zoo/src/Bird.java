public class Bird extends EgglayingAnimals {

  public Bird(String name) {
    super(name);
  }

  @Override
  public String move() {
    return "Flies";
  }
}
