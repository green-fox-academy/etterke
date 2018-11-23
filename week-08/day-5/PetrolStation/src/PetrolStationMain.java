import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;

public class PetrolStationMain {

  public static void main(String[] args) {
    Station station = new Station();
    station.setGasAmount(300);

    Car car1 = new Car();
    Car car2 = new Car();

    station.getCars().add(car1);
    station.getCars().add(car2);

    station.refill(car1);
    station.refill(car2);

    System.out.println(car1.getGasAmount());
    System.out.println(car2.getGasAmount());
    System.out.println(station.getGasAmount());


  }
}
