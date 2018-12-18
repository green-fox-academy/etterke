import java.util.ArrayList;

public class TodoApp {

  public static void main(String[] args) {

    List todoList = new List();

    if (args.length == 0) {
      printUsage();
    } else if (args[0].equals("-l")) {
      todoList.list();

    } else if (args.length == 1 && args[0].equals("-a")) {
      System.out.println("Unable to add: no task provided");

    } else if (args[0].equals("-a")) {
      todoList.add(args[1]);
      System.out.println(todoList);

    } else if (args[0].equals("-r")) {
      todoList.remove(Integer.parseInt(args[1]));
      System.out.println(todoList);
    }
  }

    public static void printUsage () {
      String usage = "Command Line Todo application\n" +
          "=============================\n" +
          "\n" +
          "Command line arguments:\n" +
          " -l   Lists all the tasks\n" +
          " -a   Adds a new task\n" +
          " -r   Removes a task\n" +
          " -c   Completes a task";

      System.out.println(usage);
    }
}
