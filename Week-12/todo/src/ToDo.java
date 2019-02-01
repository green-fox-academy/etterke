import java.io.Serializable;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

public class ToDo implements Serializable {

  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;

  public ToDo(String name) {
    this.name = name;
    this.createdAt = LocalDateTime.now(Clock.systemUTC());
  }

  public void complete() {
    completedAt = LocalDateTime.now(Clock.systemUTC());
  }

  public boolean isCompleted(){
    return completedAt != null && completedAt.isBefore(LocalDateTime.now(Clock.systemUTC()));
  }

  @Override
  public String toString() {
    return (isCompleted() ? "[x] " : "[ ] ") + name +
            (completionTime().isPresent() ? " completed in " + completionTime().get().getSeconds() + " seconds" : "");
  }
}
