public class Grocery extends ListItem{
    
    public Grocery (String item) {
        super(item);
    }

    @Override
    ListItem next() {
        // TODO Auto-generated method stub
        return this.next;
    }

    @Override
    ListItem previous() {
        // TODO Auto-generated method stub
        return this.previous;
    }

    @Override
    ListItem setNext(ListItem next) {
        // TODO Auto-generated method stub
        this.next = next;
        return this.next;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        // TODO Auto-generated method stub
        this.previous = previous;
        return this.previous;
    }

    @Override
    int compareTo (ListItem toCompare)  {
        // TODO Auto-generated method stub
        if (toCompare != null ) {
           
            return ((String) super.getValue()).compareTo(((String) toCompare.getValue()));
        }
        else {
            return -1;
            
        }
    }   



    
    
 }
   

