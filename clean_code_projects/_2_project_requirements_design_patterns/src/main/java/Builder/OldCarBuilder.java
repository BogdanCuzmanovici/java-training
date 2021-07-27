package Builder;

public  class OldCarBuilder implements CarBuilder{
    private Car car;
    public OldCarBuilder(){
        this.car = new Car() ;
    }

    public void buildCarHood(){
        car.setCarHood("Black Hood");
    }
    public void buildCarDoors(){
        car.setCarDoors("Electric Doors");
    }
    public void buildCarWheels(){
        car.setCarWheels("Shiny Wheels");
    }
    public void buildCarInterior(){
        car.setCarInterior("White interior");
    }

    public Car getCar(){
        return this.car;
    }
}
