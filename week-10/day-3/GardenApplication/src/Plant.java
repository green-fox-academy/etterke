public class Plant {

  private String color;
  private int needsWater;
  private double absorption;
  private double waterLevel;
  String plantType;

  public Plant(String color, double waterLevel) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.absorption = 1;
  }

  public void watering(int amountOfWater) {
    waterLevel += (amountOfWater * absorption);
  }

  public String checkWaterLevel() {
    if (waterLevel < needsWater) {
      return "The " + color + plantType + " needs water!";
    } else {
      return "The " + color + plantType + " doesn't need water!";
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setNeedsWater(int needsWater) {
    this.needsWater = needsWater;
  }

  public void setAbsorption(double absorption) {
    this.absorption = absorption;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public void setPlantType(String plantType) {
    this.plantType = plantType;
  }
}
