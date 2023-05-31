package main.classes.vehicle;

public abstract class Vehicle {
    private String name;
    public abstract Integer getMaxVelocity(); // polymorfizm

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
