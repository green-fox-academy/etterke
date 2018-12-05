public class Tree extends Plant {

  public Tree(String color, double waterLevel) {
    super(color, waterLevel);
    setNeedsWater(10);
    setAbsorption(0.4);
    setPlantType("Tree");
  }

  @Override
  public String toString() {
    return "" + getColor() + " " + getWaterLevel() + "";
  }
}
