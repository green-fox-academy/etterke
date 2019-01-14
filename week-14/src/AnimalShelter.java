import java.util.ArrayList;

public class AnimalShelter {

  private int budget;
  private ArrayList<Animal> shelterAnimals;
  private ArrayList<Adopter> listOfAdopters;

  public AnimalShelter() {
    this.shelterAnimals = new ArrayList<>();
    this.listOfAdopters = new ArrayList<>();
  }

  public int rescue(Animal animal) {
    shelterAnimals.add(animal);
    return shelterAnimals.size();
  }

  public void addAdopter(String name) {
    listOfAdopters.add(new Adopter(name));
  }



}
