package main.classes;

public final class ClassB extends ClassA{ // klas final nie można już dalej rozszerzać
    private transient String name; // encapsulacja np. limitowanie dostępów przez private czy wiązanie z methodami do updatowania (set/get)
    // transient skipuje przy serizalizacji
    private volatile String test;
    public ClassB(Integer a) {
        super(a); // wywołuje konstruktor z klasy którą rozszerzamy
    }

    public synchronized String getName() { // tylko jeden wątek może z tego korzystać w tym samym czasie
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//class ClassC extends ClassB {
//
//}
