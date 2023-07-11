package main.streams;

public class Enemy {
    private Integer id;
    private String name;
    private Integer level;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + ", level=" + level + '}';
    }
}
