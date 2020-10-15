import java.util.ArrayList;
import java.util.List;


public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;

    private int won =0;
    private int lost=0;
    private int tie=0;
    private int matchPlayed=0;

    private List<T> members ; 

    public Team (String name) {
        this.name = name;
        members =  new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public boolean add(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " already existed in" + this.getName());
            return false;
        }
        return members.add(player);
    }

    public boolean remove(T player){
        if(members.contains(player)) {
            System.out.println("removed "+ player.getName() +" from" +this.getName());
            return members.remove(player);
           
        }
        else {
            System.out.println(player.getName() +" is not existed.");
            return false;
        }
    }

    public Team<T> playedVersus(Team<T> opponent, int our , int their){
        matchPlayed++;
        if(our > their){
            won++;
            
        }
        else if (our < their){
            lost++;
        }
        else {
            tie++;
        }
        
        if(opponent != null) {
            System.out.println("Updated match result between " + this.getName() + " and " + opponent.getName() );
            return opponent.playedVersus(null, their, our);
        }
        else {
           
            return null;
        }
    }

    public int ranking(){
        return won * 2 + tie;
    }

    @Override
    public int compareTo(Team<T> team) {
        if( this.ranking() == team.ranking())
        {
            return 0;
        }
        return this.ranking() > team.ranking() ? -1 : 1;
       
    }
    

}
