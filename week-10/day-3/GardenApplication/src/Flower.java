public class Flower extends Plant {

  public Flower(String color, double waterLevel) {
    super(color, waterLevel);
    setNeedsWater(5);
    setAbsorption(0.75);
    setPlantType("Flower");
  }

  @Override
  public String toString() {
    return "" + getColor() + " " + getWaterLevel() + "";
  }
}
