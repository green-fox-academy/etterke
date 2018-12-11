public class Reptile extends EgglayingAnimals {

  public Reptile(String name) {
    super(name);
  }

  @Override
  public String move() {
    return "Flies or walks";
  }
}
