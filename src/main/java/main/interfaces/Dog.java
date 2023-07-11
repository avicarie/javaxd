package main.interfaces;

public class Dog implements MakesSound, EatsFood{ // klase można extendować tlyko 1 a interfejsów można implementować kilka
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void printFoodType() {
        System.out.println("Meat");
    }
}
