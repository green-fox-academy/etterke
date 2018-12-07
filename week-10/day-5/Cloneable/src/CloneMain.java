public class CloneMain {

  public static void main(String[] args) {


    Student john = new Student("John", 20, "male", "BME");
    Student johnTheClone = null;

    try {
      johnTheClone = john.clone();
    } catch (CloneNotSupportedException cns){
      System.out.println("Something went wring with cloning");
    }

    johnTheClone.introduce();
  }
}
