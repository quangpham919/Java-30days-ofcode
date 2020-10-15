public class BasketBallPlayer extends Player  {
    
    public BasketBallPlayer (String name) {
        super(name);
    }


    @Override
    String getTypeOfSport() {
        // TODO Auto-generated method stub
        System.out.println(this.getName() + " plays basketball.");
        return null;
    }
    
}
