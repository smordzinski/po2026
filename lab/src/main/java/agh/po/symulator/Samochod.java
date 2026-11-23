package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;

    public void wlacz(){
        silnik.uruchom();
    }

    public void wylacz(){
        silnik.zatrzymaj();
        skrzynia.ustawBieg(0);
    }
}
