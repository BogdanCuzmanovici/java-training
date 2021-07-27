package Builder;

public class TestCarBuilder {

    public static void main(String[] args){
        CarBuilder oldStyleCar = new OldCarBuilder();
        CarEngineer carEngineer = new CarEngineer(oldStyleCar);
        carEngineer.makeCar();

        Car firstCar = carEngineer.getCar();
        System.out.println("Car Built");
        System.out.println("Car Hood Type : " + firstCar.setCarHood());
        System.out.println("Car Doors Type : " + firstCar.setCarDoors());
        System.out.println("Car Wheels Type : " + firstCar.setCarWheels());
        System.out.println("Car Interior Type : " + firstCar.setCarInterior());


    }
}
