package main.generics;

public class Box<E> {
    private E content;

    public Box(E content) {
        this.content = content;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }
}
