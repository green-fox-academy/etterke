import java.io.*;
import java.util.ArrayList;

public class List implements Serializable {

  private ArrayList<ToDo> todoList;

  public List() {
    this.todoList = new ArrayList<>();
  }

  public void add(String todo) {
    if (new File("todo.txt").length() > 0) {
      this.todoList = readFromFile().getTodoList();
    }
    this.todoList.add(new ToDo(todo));
    writeToFile(this);
  }

  public void list() {
    this.todoList = readFromFile().getTodoList();
    System.out.println(this.toString());
  }

  public void writeToFile(List tasks) {
    String fileName = "todo.txt";
    try {
      FileOutputStream fileOutputStream
          = new FileOutputStream(fileName);
      ObjectOutputStream objectOutputStream
          = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(tasks);
      objectOutputStream.flush();
      objectOutputStream.close();
    } catch (IOException e) {
      System.out.println("Something went wrong with writing the file!");
    }
  }

  public List readFromFile() {
    String fileName = "todo.txt";
    List tasks = new List();
    try {
      FileInputStream fileInputStream
          = new FileInputStream(fileName);
      ObjectInputStream objectInputStream
          = new ObjectInputStream(fileInputStream);
      tasks = (List) objectInputStream.readObject();
      objectInputStream.close();
    } catch (IOException e) {
      System.out.println("Something went wrong with reading from the file!");
    } catch (ClassNotFoundException c) {
      System.out.println("Cannot find class");
    }
    return tasks;
  }

  public int size() {
    return this.todoList.size();
  }

  public ArrayList<ToDo> getTodoList() {
    return todoList;
  }

  public void setTodoList(ArrayList<ToDo> todoList) {
    this.todoList = todoList;
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < todoList.size(); i++) {
      result += (i+1) + " - " + todoList.get(i) + "\n";
    }
    return result;
  }
}
