package main.classes.vehicle;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        List<Vehicle> vehicleList = Arrays.asList(bike, car);
        for(Vehicle vehicle: vehicleList){
            printSpecification(vehicle);
        }
    }

    private static void printSpecification(Vehicle vehicle){
        printVelocity(vehicle);
        if(vehicle instanceof Bike) { // sprawdzamy czy isntancja pojazdu jest typu Bike, żeby zapobiec crashowaniu się programu
            System.out.println(((Bike) vehicle).brakeType()); // rzutowanie (cast) na typ Bike - żeby móc wykorzystać funkcje dostepne tylko dla rowerów
        }
        if(vehicle instanceof Car) { // sprawdzamy czy isntancja pojazdu jest typu Car, żeby zapobiec crashowaniu się programu
            System.out.println(((Car) vehicle).getBrand()); // rzutowanie (cast) na typ Car - żeby móc wykorzystać funkcje dostepne tylko dla samochodów
        }
    }
    private  static void printVelocity(Vehicle vehicle){
        System.out.println(vehicle.getMaxVelocity());
    }

    private  static void printVelocity(Car car){
        System.out.println(car.getMaxVelocity());
    }

    private  static void printVelocity(Bike bike){ // method overloading - moga mieć takie same nazwy ale z innymi parametrami
        System.out.println(bike.getMaxVelocity());
    }
}
