package agh.po.animals;

public class Parrot extends Animal{

    public Parrot(String name){
        super(name, 2);
    }

    public String getDescription() {
        return "Papuga o imieniu " + name + ", liczba nóg: " + legs;
    }
}
