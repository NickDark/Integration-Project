public class Todo {
  private ArrayList<String> list = new ArrayList<String>();
  private String item;

  //Display menu and navigation controls
  public void display() {
    if(list.isEmpty()){
      System.out.println("There's nothing in your list!");
    }
    else{
      for(int i=1; i < list.size()+1; i++) {
        System.out.println(i + ". " + list.get(i-1));
      }
    }
  }

  //add an item to the list
  public void newItem (String item) {
    list.add(item);
    }

  //remove an item from the list
  public void remItem (int itemNumber) {
    list.remove(itemNumber-1);
  }
}
