/**
 * Created by michaeldelli-gatti on 5/16/16.
 */
public class Beer {
    String beerName;
    String brewery;
    double abv;
    int outOfTen;
    public Beer(String beerName, String brewery, double abv, int outOfTen){
        this.beerName = beerName;
        this.brewery = brewery;
        this.abv = abv;
        this.outOfTen = outOfTen;
    }

    public String getBeerName(){
        return beerName;
    }
    public void setBeername(String newBeerName){
        beerName = newBeerName;
    }
    public String getBrewery(){
        return brewery;
    }
    public void setBrewery(String newBrewery){
        brewery = newBrewery;
    }
    public double getAbv(){
        return abv;
    }
    public void setAbv(double newAbv){
        abv = newAbv;
    }
    public int getOutOfTen(){
        return outOfTen;
    }
    public void setOutOfTen(int newOutOfTen){
        outOfTen = newOutOfTen;
    }
}
