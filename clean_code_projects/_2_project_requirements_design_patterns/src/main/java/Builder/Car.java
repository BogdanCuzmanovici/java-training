package Builder;

 public class Car implements CarStructure{

    private String carHood;
    private String carDoors;
    private String carWheels;
    private String carInterior;
//hood
    public void setCarHood(String hood){
        carHood = hood;
    }
    public String setCarHood(){ return carHood; }

//doors

     public void setCarDoors(String doors){
         carDoors = doors;
     }
     public String setCarDoors(){ return carDoors; }

//wheels

     public void setCarWheels(String wheels){
         carWheels = wheels;
     }
     public String setCarWheels(){ return carWheels; }

//interior

     public void setCarInterior(String interior){
         carInterior = interior;
     }
     public String setCarInterior(){ return carInterior; }



}
