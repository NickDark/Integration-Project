import java.util.Scanner;

// Nicholas Prieto

// Integration Project COP 2006

// A basic user-friendly terminal Todo app that incorporates everything I'm
// learning in my class.

public class Main extends Todo {
  public static void main(String args []) {
    boolean exit = false; //controls whether the program ends or continues according to user input
    // boolean goBack; //return to previous menu
    Todo newList = new Todo();
    Calculator calculator = new Calculator();
    Scanner input = new Scanner(System.in); //object that will read user input
    String value; //stores user input
    int listNumber; //holds the index of the item on the list and starts from 1.

    System.out.println("Welcome to The Most User-Friendly Terminal TODO App!\n");

    //loop through program and respond to input
    while (exit == false) {
      System.out.println("What would you like to do? (say 'add', 'remove','display','exit', or 'calculator')");
      value = input.nextLine();
        
      //calls the Todo class' display method to display the current list; "display" is an argument for the equalsIgnoreCase method of the String class
      if (value.equalsIgnoreCase("display")) {
        newList.display();
        System.out.println();
      }
      
      //calls the Todo class' add method to add an item to the list
      else if (value.equalsIgnoreCase("add")) {
        System.out.println("What would you like to add to the list?");
        //store input and format it to look consistent
        value = input.nextLine();
        value = value.trim();
        value = value.substring(0,1).toUpperCase() + value.substring(1);
        newList.newItem(value);
        System.out.println();
      }
      else if (value.equalsIgnoreCase("remove")) {
        System.out.println("What would you like to remove from the list? Just input the" +
        " list number.");
        value = "" + input.nextInt();
        input.nextLine();
        listNumber = Integer.parseInt(value);
        if (listNumber <= newList.getSize() && listNumber > 0) {
          newList.remItem(listNumber);
        }
        else {
          System.out.println("That number is not contained within the list.");
        }
        System.out.println();
      }
      else if (value.equalsIgnoreCase("exit")) {
        exit = true;
      }
      else if (value.equalsIgnoreCase("calculator")) {
        calculator.calculate(input.nextLine());
      }
      else {
        System.out.println("Sorry, I didn't understand your input. Please try again.\n");
      }
    }
    input.close();
  }
}
