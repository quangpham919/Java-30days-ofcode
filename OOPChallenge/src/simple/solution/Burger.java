package simple.solution;

public class Burger {
    private String name;
    private String breadRoll;
    private Double basePrice;
    private String meat;
    private Double finalPrice;
    private boolean isAddAddition1;
    private boolean isAddAddition2;
    private boolean isAddAddition3;
    private boolean isAddAddition4;

    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Burger(String name, String breadRoll, Double basePrice, String meat) {
        this.name= name;
        this.breadRoll = breadRoll;
        this.basePrice  = basePrice;
        this.meat = meat;
        isAddAddition1 = false;
        isAddAddition2 = false;
        isAddAddition3 = false;
        isAddAddition4 = false;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
        isAddAddition1=true;
        System.out.println(name+ " added "+addition1.getName()+" with price: "+addition1.getPrice());
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
        isAddAddition2=true;
        System.out.println(name+ " added "+addition2.getName()+" with price: "+addition2.getPrice());

    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
        isAddAddition3=true;
        System.out.println(name+ "added "+addition3.getName()+" with price: "+addition3.getPrice());

    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
        isAddAddition4=true;
        System.out.println(name+ "added "+addition4.getName()+" with price: "+addition4.getPrice());

    }

    public Addition getAddition1() {
        if(isAddAddition1){return addition1;}
        else{return null;}
    }

    public Addition getAddition2() {
        if(isAddAddition2){return addition2;}
        else{return null;}
    }

    public Addition getAddition3() {
        if(isAddAddition3){return addition3;}
        else{return null;}
    }

    public Addition getAddition4() {
        if(isAddAddition4){return addition4;}
        else{return null;}
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
       return basePrice;
    }

    public double getAdditionalPrice(){
        double finalPrice = 0d;
        if(isAddAddition1) {
            finalPrice += addition1.getPrice();
        }
        if(isAddAddition2) {
            finalPrice += addition2.getPrice();
        }
        if(isAddAddition3) {
            finalPrice += addition3.getPrice();
        }
        if(isAddAddition4) {
            finalPrice += addition4.getPrice();
        }
        return finalPrice ;
    }

    public void getDetails(){
        System.out.println(this.name + " with final price: " + (getAdditionalPrice() + basePrice));
    }
}
