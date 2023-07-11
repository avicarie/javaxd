package main.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        MakesSound dog = new Dog();
        printAnimal(cat);
        makesSound(dog);
        makesSound(cat);
    }

    public static void printAnimal(Animal animal){
        animal.printFoodType();
        animal.makeSound();
    }

    public static void makesSound(MakesSound makesSound){
        makesSound.makeSound();
    }
}
