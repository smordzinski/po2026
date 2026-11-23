package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    private int aktualnyBieg;
    private int iloscBiegow;

    Sprzeglo sprzeglo;

    public void zwiekszBieg(){
        if (aktualnyBieg < iloscBiegow){
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg(){
        if (aktualnyBieg>0){
            aktualnyBieg--;
        }
    }

    public void ustawBieg(int bieg){
        if (bieg >= 0 && bieg <= iloscBiegow){
            aktualnyBieg = bieg;
        }
    }
}
