package agh.po.symulator;

public class Silnik extends Komponent{
    private int maxObroty;
    private int obroty;

    public void uruchom(){
        obroty = 800;
    }

    public void zatrzymaj(){
        obroty = 0;
    }

    public Silnik(String nazwa, int waga, float cena){
        super(nazwa, waga, cena);
        this.zatrzymaj();
    }
}
