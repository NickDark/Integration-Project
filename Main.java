import java.util.Scanner;

// Nicholas Prieto

// Integration Project COP 2006

// A basic user-friendly terminal Todo app that incorporates everything I'm
// learning in my class. BEHOLD, it will be amazing by the end of the semester!

public class Main extends Todo {
  public static void main(String args []) {
    boolean exit = false;
    // boolean goBack; //return to previous menu
    Todo newList = new Todo();
    Scanner input = new Scanner(System.in);
    String value; //stores user input
    int listNumber;

    System.out.println("Welcome to The Most User-Friendly Terminal TODO App!\n");

    //loop through program and respond to input
    while (exit == false) {
      System.out.println("What would you like to do? (say 'add', 'remove','display', or 'exit')");
      value = input.nextLine();
      if (value.equalsIgnoreCase("display")) {
        newList.display();
        System.out.println();
      }
      else if (value.equalsIgnoreCase("add")) {
        System.out.println("What would you like to add to the list?");
        value = input.nextLine();
        value = value.trim();
        value = value.substring(0,1).toUpperCase() + value.substring(1);
        newList.newItem(value);
        System.out.println();
      }
      else if (value.equalsIgnoreCase("remove")) {
        System.out.println("What would you like to remove from the list? Just input the" +
        " list number.");
        listNumber = input.nextInt();
        input.nextLine();
        newList.remItem(listNumber);
        System.out.println();
      }
      else if (value.equalsIgnoreCase("exit")) {
        exit = true;
      }
      else {
        System.out.println("Sorry, I didn't understand your input. Please try again.\n");
      }
    }
    input.close();
  }
}
