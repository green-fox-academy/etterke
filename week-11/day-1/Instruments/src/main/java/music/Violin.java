package main.java.music;

public class Violin extends StringedInstruments{

  public static final String name = "Violin";

  public Violin() {
    super(name, 4);
  }

  public Violin(int numberOfStrings) {
    super(name, numberOfStrings);
  }

  @Override
  public String sound() {
    return "Screech";
  }
}
