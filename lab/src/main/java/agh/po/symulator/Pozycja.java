package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public void AktualizujPozycje(double deltaX, double deltaY){
        this.x = deltaX;
        this.y = deltaY;
    }

    public String getPozycja(){
        return "Aktualna pozycja: x = " + x + ", y= " + y;
    }
}
