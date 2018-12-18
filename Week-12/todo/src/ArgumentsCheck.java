public class ArgumentsCheck {

  public void checkArgumentsWhenAdding(String[] args, List todoList) {
    if (args.length == 1) {
      System.out.println("Unable to add: no task provided");
    } else {
      todoList.add(args[1]);
      System.out.println(todoList);
    }
  }

  public void checkArgumentsWhenRemoving(String[] args, List todoList) {
    if (args.length == 1) {
      System.out.println("Unable to remove: no index provided");
    } else {
      try {
        todoList.remove(Integer.parseInt(args[1]));
        System.out.println(todoList);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to remove: index is out of bound");
      } catch (NumberFormatException n) {
        System.out.println("Unable to remove: index is not a number");
      }
    }
  }

  public void checkArgumentsWhenChecking(String[] args, List todoList) {
    if (args.length == 1) {
      System.out.println("Unable to check: no index provided");
    } else {
      try {
        todoList.check(Integer.parseInt(args[1]));
        System.out.println(todoList);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to remove: index is out of bound");
      } catch (NumberFormatException n) {
        System.out.println("Unable to remove: index is not a number");
      }
    }
  }

  public void checkArgumentsWhenListing(String[] args, List todoList) {
    if (args.length == 1) {
      todoList.list();
    }
  }
}
