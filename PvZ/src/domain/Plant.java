package domain;

public abstract class Plant implements Unit{
    private String name;
    public Plant(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
