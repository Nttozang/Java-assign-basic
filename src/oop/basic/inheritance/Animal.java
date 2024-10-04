package oop.basic.inheritance;

public class Animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak(){
        System.out.println(name);
    }

}
