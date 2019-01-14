import java.util.ArrayList;

public class AnimalShelter {

  private int budget;
  private ArrayList<Animal> shelterAnimals;
  private ArrayList<Adopter> listOfAdopters;

  public AnimalShelter() {
    this.budget = 50;
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

  public int heal(){
    int numberOfHealedAnimals = 0;

    for (int i = 0; i < shelterAnimals.size(); i++) {
      if (!shelterAnimals.get(0).isHealthy && budget > shelterAnimals.get(0).getHealCost()) {
        shelterAnimals.get(0).setHealthy(true);
        numberOfHealedAnimals++;
      }
      budget -= shelterAnimals.get(0).getHealCost();
    }
    return numberOfHealedAnimals;
  }

  public void findNewOwner() {
    for (int i = 0; i < shelterAnimals.size(); i++) {
      for (int j = 0; j < listOfAdopters.size(); j++) {
        if (shelterAnimals.get(i).isAdoptable() && listOfAdopters.size() != 0) {
          shelterAnimals.remove(shelterAnimals.get(i));
          listOfAdopters.remove(listOfAdopters.get(j));
        }
      }
    }
  }

  public int earnDonation(int amount){
    budget += amount;
    return budget;
  }

  @Override
  public String toString() {
    String toBePrinted = "Budget: " + budget + "$, There are " + shelterAnimals.size() + " animal(s) and " + listOfAdopters.size() + " potential adopter(s)" + "\n";
    for (Animal animal : shelterAnimals) {
      toBePrinted += animal.toString() + "\n";
    }
    return toBePrinted;
  }
}
