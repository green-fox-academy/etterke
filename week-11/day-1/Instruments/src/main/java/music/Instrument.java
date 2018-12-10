package main.java.music;

public abstract class Instrument {

  public String name;

  public Instrument(String name){
    this.name = name;
  }

  public abstract void play();
}
