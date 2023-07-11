package main.generics;

import main.interfaces.Dog;

public class AnimalBoxMain {
    public static void main(String[] args) {
        AnimalBox<Dog> dogAnimalBox = new AnimalBox<>(new Dog());
        dogAnimalBox.printContent();
    }
}
