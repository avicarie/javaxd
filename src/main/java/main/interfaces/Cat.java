package main.interfaces;

public class Cat implements Animal {
    @Override
    public void printFoodType() {
        System.out.println("milk");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
