package org.example.model;

public class GenericModel {
    private Integer id;

    @Override
    public String toString() {
        return "GenericModel{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GenericModel(Integer id) {
        this.id = id;
    }
}
