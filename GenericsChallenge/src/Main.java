public class Main {
    public static void main(String[] args) throws Exception {
       Team<SoccerPlayer> vietnam = new Team<>("VietNam");
       Team<SoccerPlayer> thai = new Team<>("Thailand");
       Team<SoccerPlayer> sing = new Team<>("Singapore");
       Team<SoccerPlayer> malay = new Team<>("Malaysia");

       
       Team<BasketBallPlayer> toronto = new Team<>("Toronto Raptor");

       League<Team<SoccerPlayer>> afc = new League<>("AFC",4);

       afc.add(vietnam);
       afc.add(thai);
       afc.add(sing);
       afc.add(malay);
       
       vietnam.playedVersus(vietnam, 2, 1);
       sing.playedVersus(malay, 3, 4);
       vietnam.playedVersus(malay, 3, 2);
       thai.playedVersus(sing, 1,0 );

       afc.details();
    }
}
