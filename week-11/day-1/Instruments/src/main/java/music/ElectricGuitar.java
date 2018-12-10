package main.java.music;

public class ElectricGuitar extends StringedInstruments {

  public static final String name = "Electric Guitar";

  public ElectricGuitar(){
    super(name, 6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super(name, numberOfStrings);
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
