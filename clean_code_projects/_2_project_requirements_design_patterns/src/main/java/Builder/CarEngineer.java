package Builder;

public class CarEngineer {
    private CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }
    public Car getCar(){
        return this.carBuilder.getCar();
    }
    public void makeCar(){

        this.carBuilder.buildCarHood();
        this.carBuilder.buildCarDoors();
        this.carBuilder.buildCarWheels();
        this.carBuilder.buildCarInterior();
    }
}
