package main.packages.first;

import java.util.Objects;

public class ClassA {
    protected Integer a;

    public ClassA(Integer a) {
        this.a = a;
    }

    public ClassA() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassA classA = (ClassA) o;
        return Objects.equals(a, classA.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
