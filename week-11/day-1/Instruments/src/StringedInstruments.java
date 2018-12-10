public abstract class StringedInstruments extends Instrument {

  int numberOfStrings;

  public StringedInstruments(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  abstract void sound();

  @Override
  void play() {
    sound();
  }
}
