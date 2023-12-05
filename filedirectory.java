import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 class Main {

  public static void main(String[] args) {
    // Get the command line argument
    String input = args[0];

    // Check if the file or directory exists
    File file = new File(input);
    if (!file.exists()) {
      System.out.println("File or directory does not exist.");
      return;
    }

    // If it is a directory, delete all text files in that directory
    if (file.isDirectory()) {
      // Ask the user to confirm the deletion
      System.out.println("Are you sure you want to delete all text files in this directory? (y/n)");
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine();
      if (!answer.equals("y")) {
        System.out.println("Deletion cancelled.");
        return;
      }                                                                                                     

      // Delete all text files in the directory
      int count = 0;
      for (File f : file.listFiles()) {
        if (f.getName().endsWith(".txt")) {
          f.delete();
          count++;
        }
      }

      // Display the number of files deleted
      System.out.println(count + " text files deleted.");
    }

    // If it is a file, display various details of that file
    else {
      System.out.println("File name: " + file.getName());
      System.out.println("File path: " + file.getPath());
      System.out.println("File length: " + file.length());
      System.out.println("File last modified: " + file.lastModified());
    }
  }
}