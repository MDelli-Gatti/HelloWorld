/**
 * Created by michaeldelli-gatti on 5/16/16.
 */
public class Team {
    String city;
    String mascot;
    int wins;
    int losses;

    public Team(String city, String mascot, int wins, int losses){
        this.city = city;
        this.mascot = mascot;
        this.wins = wins;
        this.losses = losses;
    }
    public String getCity(){
        return city;
    }
    public void setCity (String newCity){
        city = newCity;
    }
    public String getMascot(){
        return mascot;
    }
    public void setMascot(String newMascot){
        if (isValidMascot(newMascot)){
            mascot = newMascot;
        }
    }
    public int getWins(){
        return wins;
    }
    public void setWins (int newWins){
        wins = newWins;
    }
    public int getLosses(){
        return losses;
    }
    public void setLosses( int newLosses){
        losses = newLosses;
    }

    public static boolean isValidMascot(String newMascot){
        return newMascot.contains("Bengals");
    }
}
