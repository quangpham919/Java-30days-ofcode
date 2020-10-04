package simple.solution;

public class HealthyBurger extends Burger {
    private boolean isAddAddtion5;
    private boolean isAddAddtion6;
    private Addition addition5;
    private Addition addition6;

    public HealthyBurger( Double basePrice, String meat) {
        super("Healthy Burger", "Brown Rye Bread Roll", basePrice, meat);
        isAddAddtion5 = false;
        isAddAddtion6 = false;
    }

    public void setAddition5(Addition addition5) {
        this.addition5 = addition5;
        isAddAddtion5 =true;

        System.out.println(this.getName()+ " added "+addition5.getName()+" with price: "+addition5.getPrice());

    }
    public void setAddition6(Addition addition6) {
        this.addition6 = addition6;
        isAddAddtion6=true;
        System.out.println(this.getName()+ " added "+addition6.getName()+" with price: "+addition6.getPrice());

    }

    @Override
    public double getAdditionalPrice() {
        double finalPrice = super.getAdditionalPrice();
        if(isAddAddtion5){
            finalPrice += addition5.getPrice();
        }
        if(isAddAddtion6){
            finalPrice+= addition6.getPrice();
        }

        return  finalPrice;
    }

    @Override
    public void getDetails() {
        System.out.println("HEALTHY BURGER's final price: "+ (getAdditionalPrice() + this.getBasePrice()));
    }
}
