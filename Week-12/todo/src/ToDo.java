import java.io.Serializable;

public class ToDo implements Serializable {

  private String name;
  private boolean completed;

  public ToDo(String name) {
    this.name = name;
    this.completed = false;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}
