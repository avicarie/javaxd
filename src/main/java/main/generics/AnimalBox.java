package main.generics;


import main.interfaces.MakesSound;

public class AnimalBox <E extends MakesSound> {
    private E content;

    public AnimalBox(E content) {
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public void printContent(){
        content.makeSound();
    }
}
