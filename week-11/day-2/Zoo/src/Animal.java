public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int weight;

  public Animal (String name) {
    this.age = age;
    this.gender = gender;
    this.weight = weight;
  }

  public abstract String breed();

  public abstract void move();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
