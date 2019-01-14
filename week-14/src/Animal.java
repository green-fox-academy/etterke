public class Animal {

  String name;
  boolean isHealthy;
  int healCost;

  public Animal() {
    this.isHealthy = isHealthy;
    int healCost = 0;
  }

  public Animal(String name) {
    this.name = name;
    this.isHealthy = isHealthy;
    int healCost = 0;
  }

  public void heal() {
    isHealthy = true;
  }

  public boolean isAdoptable() {
    if (isHealthy = true) {

    }
    return true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isHealthy() {
    return isHealthy;
  }

  public void setHealthy(boolean healthy) {
    isHealthy = healthy;
  }

  public int getHealCost() {
    return healCost;
  }

  public void setHealCost(int healCost) {
    this.healCost = healCost;
  }

  @Override
  public String toString() {
    if (!this.isHealthy) {
      return this.getName() + " is not healthy, the heal cost is: " + this.getHealCost() + "$, and is not adoptable";
    } else {
      return this.getName() + " is healthy, and adoptable";
    }
  }
}
