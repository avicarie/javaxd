package main.interfaces;

public interface MakesSound {
    default void makeSound(){
        System.out.println("default");
    }

}

