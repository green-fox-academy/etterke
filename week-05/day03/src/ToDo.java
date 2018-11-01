import  java.util.ArrayList;

public class ToDo {

    public static void main(String... args){

        ArrayList <String> todoText = new ArrayList();
            todoText.add("My todo:\n");
            todoText.add(" - Buy milk\n");
            todoText.add(" - Download games\n");
            todoText.add(" \t- Download games\n");


        for(String list: todoText) {
            System.out.println(list);
        }
    }
}
