public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem (ListItem item);
    ListItem searchItem( ListItem item);
    void traverse(); 
}
