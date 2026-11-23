package agh.po.symulator;

public class Sprzeglo extends Komponent{
    private boolean stanSprzegla;

    public void wcisnij(){
        stanSprzegla = true;
    }

    public void zwolnij(){
        stanSprzegla = false;
    }

    public Sprzeglo(String nazwa, int waga, float cena){
        super(nazwa, waga, cena);
        this.zwolnij();
    }
}
