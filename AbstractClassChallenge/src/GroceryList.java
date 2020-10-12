public class GroceryList implements NodeList {
    private ListItem root;
    

    public GroceryList () {
        root = null;
    }


    @Override
    public ListItem getRoot() { 
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        
        if(root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        
        // traverse through the list until the most right or the most left.
        while (currentItem != null) {
           
            // newItem is greater than current item
            if(currentItem.compareTo(newItem) < 0){
                if(currentItem.next != null) {
                    // move to the most right
                    currentItem = currentItem.next();
                }
                else {
                    // set next reference for the current item
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }

            // new Item is less than current item
            else if ( currentItem.compareTo(newItem) > 0) {
                
                if ( currentItem.previous() != null ){
                    currentItem.previous.setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }
                else {
                    // currentItem is the root 
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                    
                }
                return true;
            }

            // newItem is equal to the current item;
            else {
                System.out.println(newItem.getValue() + " is already existed.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToDelete) {
        if (this.root != null ) {
            ListItem current = this.root;

            while ( current != null) {
                // Founded item to delete
                if ( current.compareTo(itemToDelete) == 0 ) {
                    
                    // if item to delete is the root
                    if ( current == this.root) {
                        this.root = current.next();
                        
                    }
                    // if item to delete is the last item of the list
                    else if (current.next() == null) {
                        current.previous().setNext(null);
                    }
                    // if item to delete is in between of the list 
                    else {
                        current.previous().setNext(current.next()).setPrevious(current.previous());
                      
                    }

                    System.out.println(itemToDelete.getValue() + " is removed from the list.");
                    return true;
                } 
                else {
                    current = current.next();
                }
            }
            System.out.println(itemToDelete.getValue() + " is not existed in the list.");
        
        }
        else {
            System.out.println("The list is now empty...");
        }
        return false;
    }

    @Override
    public void traverse() {
        if (this.root == null) {System.out.println("Grocery list is empty. Please add some item to display.");}
       
        else {
            ListItem current = this.root;
            int index = 1;
            while(current != null){
                
                System.out.println(index+ ". " + current.getValue());
                index++;
                current = current.next();
            }
        }
       

    }

    @Override
    public ListItem searchItem(ListItem item) {
        if( item != null) {

        }
        return null;
    }
    
}
