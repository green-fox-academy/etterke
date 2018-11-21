public class AnimalMain {

  public static void main(String[] args) {

    Animal myAnimal = new Animal();

    myAnimal.eat();
    System.out.println(myAnimal.getHunger());

    myAnimal.drink();
    System.out.println(myAnimal.getThirst());

    myAnimal.play();
    System.out.println(myAnimal.getThirst());
    System.out.println(myAnimal.getHunger());
  }
}
