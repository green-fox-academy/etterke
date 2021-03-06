import java.sql.SQLOutput;
import java.util.ArrayList;

public class TodoApp {

  public static void main(String[] args) {

    List todoList = new List();
    ArgumentsCheck handle = new ArgumentsCheck();

    if (args.length == 0) {
      printUsage();

    } else if (args[0].equals("-l")) {
      handle.checkArgumentsWhenListing(args, todoList);

    } else if (args[0].equals("-a")) {
      handle.checkArgumentsWhenAdding(args, todoList);

    } else if (args[0].equals("-r")) {
      handle.checkArgumentsWhenRemoving(args, todoList);

    } else if (args[0].equals("-c")) {
      handle.checkArgumentsWhenChecking(args, todoList);

    } else {
      System.out.println("Unsupported argument");
      printUsage();
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
