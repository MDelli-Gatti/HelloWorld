/**
 * Created by michaeldelli-gatti on 5/16/16.
 */
public class Character1 {
    String tvShow;
    boolean isAlive;
    String house;
    String name;

    public Character1 (String tvShow, boolean isAlive, String house, String name){
        this.tvShow = tvShow;
        this.isAlive = isAlive;
        this.house = house;
        this.name = name;
    }

    public String getTvShow(){
        return tvShow;
    }
    public void setTvShow(String newTvShow){
        tvShow = newTvShow;
    }
    public boolean getIsAlive(){
        return isAlive;
    }
    public void setIsAlive(boolean newIsAlive){
        isAlive = newIsAlive;
    }
    public String getHouse(){
        return house;
    }
    public void setHouse(String newHouse){
        house = newHouse;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
}
