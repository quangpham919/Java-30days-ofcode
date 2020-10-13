public class Main {
    public static void main(String[] args) throws Exception {
        BinarySearchTree myList = new BinarySearchTree();
      
      
        myList.addItem(new Grocery("Eggs"));
        myList.addItem(new Grocery("Milk"));
        myList.addItem(new Grocery("Beef"));
        myList.addItem(new Grocery("Noodles"));
        myList.addItem(new Grocery("Chicken"));
        myList.addItem(new Grocery("Salmon"));
        myList.addItem(new Grocery("Salmon"));
        myList.addItem(new Grocery("Tofu"));
        myList.addItem(new Grocery("Vegetables"));
        myList.addItem(new Grocery("Oranges"));
        myList.addItem(new Grocery("Banana"));
        
        myList.traverse();
  
        myList.removeItem(new Grocery("Eggs"));
        myList.removeItem(new Grocery("Banana"));
        myList.removeItem(new Grocery("Vegetables"));
        myList.removeItem(new Grocery("Tofu"));
        myList.traverse();      
        myList.removeItem(new Grocery("Chicken"));
        myList.removeItem(new Grocery("Salmon"));
        myList.removeItem(new Grocery("Oranges"));
        myList.removeItem(new Grocery("Pineapple"));
        myList.traverse();        
        myList.removeItem(new Grocery("Beef"));
        myList.removeItem(new Grocery("Milk"));
        myList.removeItem(new Grocery("Eggs"));
        myList.traverse();        
        myList.removeItem(new Grocery("Noodles"));
        myList.traverse();        
    }
}
