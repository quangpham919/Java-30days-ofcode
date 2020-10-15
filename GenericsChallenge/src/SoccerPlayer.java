public class SoccerPlayer extends Player {
    

    public SoccerPlayer(String name){
        super(name);
    }


    @Override
    String getTypeOfSport() {
        System.out.println(this.getName() + " plays soccer.");
        return null;
    }
    
}
