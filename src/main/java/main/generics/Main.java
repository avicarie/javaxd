package main.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(10);
        Box<String> stringBox = new Box<>("test");
        List<Box> boxes = Arrays.asList(integerBox, stringBox);
        System.out.println("Integer box contains: " + integerBox.getContent());
        System.out.println("String box contains: " + stringBox.getContent());

        for(Box box: boxes){
            System.out.println("Box contain: " + box.getContent());
        }
    }
}
