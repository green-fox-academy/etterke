package main.java.music;

public class BassGuitar extends StringedInstruments{

  public static final String name = "Bass Guitar";

  public BassGuitar() {
    super(name, 4);
  }

  public BassGuitar(int numeberOfStrings) {
    super(name, numeberOfStrings);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
