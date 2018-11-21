public class SharpieMain {

  public static void main(String[] args) {

    Sharpie myPurpleSharpie = new Sharpie("purple", 0.75f);
    Sharpie myOrangeSharpie = new Sharpie("orange", 1.5f);

    myPurpleSharpie.use();
    System.out.println(myPurpleSharpie.getInkAmount());

    myOrangeSharpie.use();
    System.out.println(myOrangeSharpie.getInkAmount());
  }
}
