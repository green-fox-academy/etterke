package main.java.music;

public abstract class StringedInstruments extends Instrument {

  public int numberOfStrings;

  public StringedInstruments(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();

  @Override
  public void play() {
    System.out.println(String.format("%s, %d-stringed instrument that goes %s",
        name,
        numberOfStrings,
        sound()));
  }
}
