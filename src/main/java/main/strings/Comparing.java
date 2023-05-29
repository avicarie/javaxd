package main.strings;

import main.packages.first.ClassA;

public class Comparing {
    public static void main(String[] args) {
//        String a = "test";
//        String b = new String("test");
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

        String c = "xd";
        String g = "xd";
        ClassA classA = new ClassA(5);
        ClassA classA1 = new ClassA(5);
        System.out.println(c == g);
        System.out.println(classA == classA1);
    }
}
