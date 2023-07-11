package main.generics;

import java.time.LocalDateTime;

public abstract class BaseEntity<E> {
    //@Ida
    E id;
    String createBy;
    LocalDateTime lastModified;
    Integer version;

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getVersion() {
        return version;
    }

    private void onUpdate(){
        version = version + 1;
    }
}
