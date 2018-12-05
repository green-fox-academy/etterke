import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void add(Plant plant) {
    this.plants.add(plant);
  }

  public void checkPlantsWaterLevel() {
    for (int i = 0; i < plants.size(); i++) {
      System.out.println(plants.get(i).checkWaterLevel());
    }
  }

  public ArrayList<Plant> getPlants() {
    return plants;
  }

  public void setPlants(ArrayList<Plant> plants) {
    this.plants = plants;
  }

  @Override
  public String toString() {
    return "Garden{" +
        "plants=" + plants +
        '}';
  }
}
