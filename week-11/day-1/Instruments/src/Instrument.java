public abstract class Instrument {

  String name;

  public Instrument(String name){
    this.name = name;
  }

  abstract void play();
}
