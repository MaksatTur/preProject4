package web.model;

public class Car {
    private String name;
    private String owner;
    private String seria;

    public Car(String name, String owner, String seria) {
        this.name = name;
        this.owner = owner;
        this.seria = seria;
    }

    public Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }
}
