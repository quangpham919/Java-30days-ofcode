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
        // TODO Auto-generated method stub
        return false;
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
