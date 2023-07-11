package main.classes.vehicle;

public class Bike extends Vehicle{
    @Override
    public Integer getMaxVelocity() {
        return 40;
    }

    public String brakeType(){
        return "shield";
    }
}
