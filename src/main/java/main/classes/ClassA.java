package main.classes;

public abstract class ClassA {
    private Integer a = 1; // pola/atrybuty
    public final Integer publicInt; // final w klasie musi mieć od razu lub w każdym konstruktorze przypisaną wartość bo inaczej byłaby useless
    protected Integer protectedInt;
    Integer intPackagePrivate;
    public static Integer staticInt;

    public ClassA() { // constructory
        super();
        publicInt = 2;
    }

    public ClassA(ClassA classA){
        publicInt =2 ;
        a = classA.getA();
    }

    public ClassA(Integer a) {
        publicInt = 2;
        this.a = a;
    }

    public Integer getA() { // funkcje/method
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    private class TestC {

    }
}

class TestPackagePrivate {

}
