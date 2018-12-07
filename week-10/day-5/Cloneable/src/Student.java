public class Student extends Person implements Cloneable {

  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    previousOrganization = "The School Of Life";
    skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  protected Student clone() throws CloneNotSupportedException {
    Student clone = new Student(getName(), getAge(), getGender(), getPreviousOrganization());
    return clone;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer!");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    return skippedDays += numberOfDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }
}
