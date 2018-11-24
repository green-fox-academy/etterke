import java.util.ArrayList;

public class SharpieSet {

  private ArrayList<Sharpie> sharpies;

  public SharpieSet() {
    sharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    this.sharpies.add(sharpie);
  }

  public ArrayList<Sharpie> countUsable() {
    ArrayList<Sharpie> usableSharpies = new ArrayList<>();
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkAmount() != 0) {
        usableSharpies.add(sharpies.get(i));
      }
    }
    return usableSharpies;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpies.size() ; i++) {
      if (sharpies.get(i).getInkAmount() == 0.0) {
        sharpies.remove(sharpies.get(i));
      }
    }
  }

  public ArrayList<Sharpie> getSharpies() {
    return sharpies;
  }

  public void setSharpies(ArrayList<Sharpie> sharpies) {
    this.sharpies = sharpies;
  }

  @Override
  public String toString() {
    return "SharpieSet{" +
        "sharpies=" + sharpies +
        '}';
  }
}
