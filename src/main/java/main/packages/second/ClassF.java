package main.packages.second;

import main.packages.first.ClassA;

public class ClassF {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
//        classA.a // nie działa bo protected nie można użyć poza pakietem lub rozszerzającą klasą
    }
}
