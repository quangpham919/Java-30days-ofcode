public abstract class ListItem {
    protected ListItem next;
    protected ListItem previous;
    private Object value;

    public ListItem( Object value ){
        next = null;
        previous = null;
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();
    abstract int compareTo(ListItem toCompare);
    
        

    
    /**
     * @param next the next to set
     */
    abstract ListItem setNext(ListItem next); 

    
    /**
     * @param previous the previous to set
     */
    abstract ListItem setPrevious(ListItem previous);

    /**
     * @return String return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @return String return the value
     */
    public void setValue(Object value) {
        this.value = value;
    }
  
}
