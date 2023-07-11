package main.streams;

import java.util.List;

public class Friend {
    private Integer id;
    private String name;
    private List<Enemy> enemies;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

}
