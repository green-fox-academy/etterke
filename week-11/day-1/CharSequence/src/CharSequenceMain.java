public class CharSequenceMain {

  public static void main(String[] args) {

    Gnirts g = new Gnirts("irresistible");

    System.out.println(g.charAt(5));
    System.out.println(g.length());
    System.out.println(g.subSequence(3, 7));

    Shifter s = new Shifter("irresistible", 5);

    System.out.println(s.charAt(0));
    System.out.println(s.length());
    System.out.println(s.subSequence(3, 7));
  }
}
