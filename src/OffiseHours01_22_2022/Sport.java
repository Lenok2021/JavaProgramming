package OffiseHours01_22_2022;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport (String name, int players, boolean teams){
        name = name;
        numOfPlayers = players;
        teamBased = teams;
    }

    public String toString(){
        String msg = "The sport is" + name + "and has" +
                numOfPlayers + "players total" ;
        if(teamBased){
            msg += "divided into teams";
        } else {
            msg += "but there is no teams";
        }
        return msg;
    }


}
