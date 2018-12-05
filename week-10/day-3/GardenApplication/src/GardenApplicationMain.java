public class GardenApplicationMain {
  public static void main(String[] args) {

    Flower yellow = new Flower("yellow", 0);
    Flower blue = new Flower("blue", 0);
    Tree purple = new Tree("purple", 0);
    Tree orange = new Tree("orange", 0);

    Garden myGarden = new Garden();
    myGarden.add(yellow);
    myGarden.add(blue);
    myGarden.add(purple);
    myGarden.add(orange);

    myGarden.checkPlantsWaterLevel();
    myGarden.waterThePlants(40);
    System.out.println(myGarden.toString());

    myGarden.checkPlantsWaterLevel();
    myGarden.waterThePlants(70);
    System.out.println(myGarden.toString());

    myGarden.checkPlantsWaterLevel();
  }
}
