import java.util.ArrayList;

public class Station {

  private int gasAmount;
  private ArrayList<Car> cars;

  public Station(){
    cars = new ArrayList<>();
  }

  public void refill(Car car) {
    int differenceInGas = car.getCapacity() - car.getGasAmount();
    int actualGasAmount = car.getGasAmount();
    if (gasAmount >= differenceInGas) {
      gasAmount -= differenceInGas;
      car.setGasAmount(actualGasAmount + differenceInGas);
    } else {
      car.setGasAmount(actualGasAmount + gasAmount);
    }
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public ArrayList<Car> getCars() {
    return cars;
  }

  public void setCars(ArrayList<Car> cars) {
    this.cars = cars;
  }
}
