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

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia){
        this.silnik = silnik;
        this.skrzynia = skrzynia;
    }

    public static void main(String[] args) {
        Sprzeglo cierne = new Sprzeglo("cierne", 10, 1500);
        SkrzyniaBiegow manualna = new SkrzyniaBiegow("manualna", 40, 7000);
        Silnik diesel = new Silnik("diesel", 140, 3000, 5000);

        manualna.sprzeglo = cierne;

        Samochod opel = new Samochod(diesel, manualna);
        opel.wlacz();
        manualna.sprzeglo.wcisnij();
        manualna.ustawBieg(4);
        System.out.println("Aktualny bieg: " + opel.skrzynia.getAktualnyBieg());
        opel.skrzynia.zmniejszBieg();
        System.out.println("Aktualny bieg: " + opel.skrzynia.getAktualnyBieg());
        System.out.println("Stan sprzegla: " + cierne.getStanSprzegla());
        manualna.sprzeglo.zwolnij();
        System.out.println("Stan sprzegla: " + cierne.getStanSprzegla());
        opel.wylacz();
    }
}
