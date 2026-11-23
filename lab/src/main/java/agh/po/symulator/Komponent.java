package agh.po.symulator;

public abstract class Komponent {
    private String nazwa;
    private int waga;
    private float cena;

    public String getNazwa(){
        return nazwa;
    }

    public int getWaga(){
        return waga;
    }

    public float getCena(){
        return cena;
    }
}
