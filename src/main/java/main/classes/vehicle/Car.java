package main.classes.vehicle;

public class Car extends Vehicle{
    @Override
    public Integer getMaxVelocity() {
        return 200;
    }

    public String getBrand(){
        return "Volvo";
    }
}
