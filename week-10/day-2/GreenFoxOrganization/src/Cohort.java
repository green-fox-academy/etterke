import java.util.ArrayList;

public class Cohort {

  private String nameOfCohort;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public Cohort(String nameOfCohort) {
    this.nameOfCohort = nameOfCohort;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public void addStudent(Student student){
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info(){
    System.out.println("The " + nameOfCohort + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}




