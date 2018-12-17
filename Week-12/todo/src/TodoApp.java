import java.util.ArrayList;

public class TodoApp {

  public static void main(String[] args) {

    String usage = "Command Line Todo application\n" +
        "=============================\n" +
        "\n" +
        "Command line arguments:\n" +
        " -l   Lists all the tasks\n" +
        " -a   Adds a new task\n" +
        " -r   Removes a task\n" +
        " -c   Completes a task";

    List todoList = new List();

    if (args.length == 0) {
      System.out.println(usage);
    } else if (args[0].equals("-l")) {
      todoList.list();

    } else if (args[0].equals("-a")) {
      todoList.add(args[1]);
      System.out.println(todoList);
    }
  }
}
