public class PostItMain {
  public static void main(String[] args) {
    PostIt myPostIt = new PostIt("yellow", "\"This is my first PostIt", "black");
    System.out.println("This PostIt is " + myPostIt.getBackgroundColor() + " and has " + myPostIt.getText() + " written on it with " + myPostIt.getTextColor() + " ink");

    PostIt myPostIt2 = new PostIt("orange", "Idea1", "blue");
    System.out.println("This PostIt is " + myPostIt2.getBackgroundColor() + " and has " + myPostIt2.getText() + " written on it with " + myPostIt2.getTextColor() + " ink");

    PostIt myPostIt3 = new PostIt("pink", "Awesome!", "green");
    System.out.println("This PostIt is " + myPostIt3.getBackgroundColor() + " and has " + myPostIt3.getText() + " written on it with " + myPostIt3.getTextColor() + " ink");
  }
}