/**
 * Created by michaeldelli-gatti on 5/16/16.
 */
public class Show {
    String name;
    int runtime;//minutes
    double rating;//out of 10
    String favoriteCharacter;

    public Show(String name, int runtime, double rating, String favoriteCharacter){
        this.name = name;
        this.runtime = runtime;
        this.rating = rating;
        this.favoriteCharacter = favoriteCharacter;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getRuntime(){
     return runtime;
    }
    public void setRuntime(int newRuntime){
        runtime = newRuntime;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double newRating){
        rating = newRating;
    }
    public String getFavoriteCharacter(){
        return favoriteCharacter;
    }
    public void setFavoriteCharacter(String newFavoriteCharacter){
        favoriteCharacter = newFavoriteCharacter;
    }
}
