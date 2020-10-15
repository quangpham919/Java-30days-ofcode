import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class League<T extends Team> {
    
    private String name;
    private int numberOfTeam;

    private ArrayList<T> teams;

    public League (String name, int numb){
        this.name = name;
        this.numberOfTeam = numb;
        teams = new ArrayList<>(numb);
    }

    public boolean add(T team) {
        if (teams.contains(team)){
            System.out.println( team.getName() + " is already existed.");
            return false;
        }
        teams.add(team);
        return true;
    }

    public boolean remove(T team) {
        if (teams.contains(team)){
            System.out.println(team.getName() + " is removing from the league.");
            teams.remove(team);
        }

        System.out.println(team.getName() + " is not existed in the league.");
        return false;
    }
    
    public void details(){
        Collections.sort(teams);
        System.out.println("Teams \t\t Points\n");
        for(T team: teams){
            System.out.println(team.getName() +" \t\t " + team.ranking() +"\n");
        }
    }


}
