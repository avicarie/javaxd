package main.generics;

public class UserEntity extends BaseEntity<String>{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
