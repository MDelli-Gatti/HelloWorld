/**
 * Created by michaeldelli-gatti on 5/16/16.
 */
public class Automobile {
    String make;
    String model;
    int year;
    double zeroToSixty;//seconds

    public Automobile(String make, String model, int year, double zeroToSixty){
        this.make = make;
        this.model = model;
        this.year = year;
        this.zeroToSixty = zeroToSixty;
    }

    public String getMake(){
        return make;
    }
    public void setMake (String newMake){
        make = newMake;
    }
    public String getModel(){
        return model;
    }
    public void setModel (String newModel){
        model = newModel;
    }
    public int getYear(){
        return year;
    }
    public void setYear (int newYear){
        year = newYear;
    }
    public double getZeroToSixty(){
        return zeroToSixty;
    }
    public void setZeroToSixty(double newZeroToSixty){
        zeroToSixty = newZeroToSixty;
    }
}
