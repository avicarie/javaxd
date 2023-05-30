package main.classes;

import java.time.Clock;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 5;
        ClassA classA;
        classA = new ClassB(5);
        ClassA classA1 = new ClassB(6);
//        classA1.getName() masz dostęp tylko do tych rzeczy które udstępnia zadeklarowany typ w tym wypadku ClassA
        ClassA classA2 = classA; // kopiujesz adres pamięci bo to on tak naprawdę jest wartością dla zmiennej classA
        // a ten adres pamięci wskazuje na miejsce gdzie przechowywany jest nasz obiekt
        classA2.setA(10);


//        System.out.println(classA.getA());
//        System.out.println(classA2.getA());
        ClassA.staticInt = 5;
//        System.out.println(ClassA.staticInt);



        Mathematics mathematics = new Mathematics(Clock.system(ZoneId.of("Australia/Darwin")));
//        System.out.println(mathematics.getCurrentDate());
        System.out.println(Mathematics.sum(5,6));

    }
}
