import java.util.ArrayList;

public class SharpieSetMain {

  public static void main(String[] args) {

    SharpieSet sharpies = new SharpieSet();

    Sharpie sharpie1 = new Sharpie(60);
    sharpies.add(sharpie1);
    Sharpie sharpie2 = new Sharpie("orange", 1.5f);
    sharpies.add(sharpie2);
    Sharpie sharpie3 = new Sharpie(30);
    sharpies.add(sharpie3);
    Sharpie sharpie4 = new Sharpie("yellow", 0.75f);
    sharpies.add(sharpie4);

    for (int i = 0; i < sharpie1.getInkAmount(); i++) {
      while (sharpie1.getInkAmount() > 0) {
        sharpie1.use();
      }
      while (sharpie2.getInkAmount() > 0) {
        sharpie2.use();
      }
    }

    System.out.println(sharpies.countUsable());
    sharpies.removeTrash();
    System.out.println(sharpies.toString());
  }
}
