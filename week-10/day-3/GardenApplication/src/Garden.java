import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void add(Plant plant) {
    plants.add(plant);
  }

}
