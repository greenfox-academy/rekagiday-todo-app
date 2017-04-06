import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class App {

  public static void main(String[] args) {

    ToDoList list = new ToDoList();

    if (args.length == 0) {
      list.printUsage();
    } else if (args[0].contains("l"))
      list.listToDos();
  }
}
