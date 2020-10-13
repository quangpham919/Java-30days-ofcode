public class BinarySearchTree implements NodeList {
    private ListItem root;
    
    public BinarySearchTree (){
        this.root = null;
    }
    @Override
    public ListItem getRoot() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addItem(ListItem item) {
      
        if(this.root == null) {
            
            this.root = item;
            return true;
        }
        ListItem current = root;
        while (current != null) {
            int comparison = (current.compareTo(item));
            if (comparison > 0 ) {
                   // current is greater than item move item to the left
                if ( current.previous() != null) {
                    current = current.previous();
                }
                else {
                     current.setPrevious(item);
                     return true;
                }   
               }
            else if (comparison < 0) {
                   // current is less than item move item to the right
                   if ( current.next() != null) {
                       current = current.next();

                   }
                   else {
                       current.setNext(item);
                       return true;
                   }
            }
            else {
                   // current equals to item
                   System.out.println(item.getValue() + " is existed...");
                   return false;
            }
        }
        return false;
        
    }

    @Override
    public boolean removeItem(ListItem item) {
        
        if ( item != null){
            System.out.println("Deleting item "+ item.getValue());
        }

        ListItem current = this.root;
        ListItem parent = current;

        while(current!=null) {
            int comparison = current.compareTo(item);
           
            if (comparison > 0) {
                parent = current;
                current = current.previous();
            }
            else if (comparison < 0) {
                parent = current;
                current = current.next();

            }
            else {
                removeHelper(current, parent);
                return true;
            }

        }
        return false;
    }

    private void removeHelper(ListItem removedItem, ListItem parent) {
        // remove item method 

        if (removedItem.next() == null) {
            // No right child case. 
            if (parent.next() == removedItem) {
                // item is the right child of its parent.
                // set parent right child is the left child of to be removed item.
                parent.setNext(removedItem.previous());
            }
            else if (parent.previous() == removedItem) {
                   // item is the left child of its parent.
                   // set parent left child is the left child of to be removed item.

                   parent.setPrevious(removedItem.previous());
            }
            else {
                // parent is the remove item. which is the root
                this.root = removedItem.previous();
            }


        }
        else if ( removedItem.previous() == null) {
            // No left child case.
            if (parent.next() == removedItem) {
                // item is the right child of its parent.
                // set parent right child is the left child of to be removed item.
                parent.setNext(removedItem.next());
            }
            else if (parent.previous() == removedItem) {
                   // item is the left child of its parent.
                   // set parent left child is the left child of to be removed item.

                   parent.setPrevious(removedItem.next());
            }
            else {
                // parent is the remove item. which is the root
                this.root = removedItem.next();
            }
        }
        else {
            // neither left or right is null. 
            ListItem current = removedItem.next();
            ListItem leftMostParent = removedItem;
            while( current.previous() != null) {
                // traverse to the left most child of the right sub tree of the removed item
                leftMostParent = current;
                current = current.previous();
              
            }   
            // Copy the value of the left most child to the removed item
            removedItem.setValue(current.getValue());

            // removed the left most child 
            if(leftMostParent == removedItem) {
                // there is no left most child.     
                // current is the only child of removed Item.
                removedItem.setNext(current.next());

            }
            else {
                // set the smallest node parent to point to
                // the smallest node right child ( which may be null)
                leftMostParent.setPrevious(current.next());
            }

        }
    }

    @Override
    public void traverse() {
        // recursive method
        if(root == null) {
            System.out.println("List is empty...");
        }
        else {
            ListItem current = this.root;
            traverseHelper(current);
        }
     
    }

    private void traverseHelper(ListItem current){
        if(current == null) {
            return;
        }
        else{
            traverseHelper(current.previous());
            System.out.println("." + current.getValue() );
            
            traverseHelper(current.next());
        }
    }
}
 