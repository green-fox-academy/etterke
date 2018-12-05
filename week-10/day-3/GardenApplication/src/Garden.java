import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> plants;
  private int numberOfWitheringPlants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void add(Plant plant) {
    this.plants.add(plant);
  }

  public void checkPlantsWaterLevel() {
    numberOfWitheringPlants = 0;
    for (int i = 0; i < plants.size(); i++) {
      System.out.println(plants.get(i).checkWaterLevel());
      numberOfWitheringPlants ++;
    }
  }

  public void waterThePlants(int amountOfWater) {
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).checkIfNeedsWater()) {
        plants.get(i).watering(amountOfWater / numberOfWitheringPlants);
      }
    }
  }

  @Override
  public String toString() {
    return "Garden{" +
        "plants=" + plants +
        '}';
  }
}
