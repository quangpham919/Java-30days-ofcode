package simple.solution;

public class DeluxeBurger extends Burger {

    public DeluxeBurger( String breadRoll, Double basePrice, String meat) {
        super("Deluxe Burger", breadRoll, basePrice, meat);
        Addition chips = new Addition("Chips",5.0);
        Addition drinks = new Addition("Drinks", 1.5);
        super.setAddition1(chips);
        super.setAddition2(drinks);
    }
    

    @Override
    public void setAddition1(Addition addition1) {
        System.out.println("You cannot add items on deluxe burger");
    }

    @Override
    public void setAddition2(Addition addition2) {
        System.out.println("You cannot add items on deluxe burger");
    }

    @Override
    public void setAddition3(Addition addition3) {
        System.out.println("You cannot add items on deluxe burger");
    }

    @Override
    public void setAddition4(Addition addition4) {
        System.out.println("You cannot add items on deluxe burger");
    }
}
