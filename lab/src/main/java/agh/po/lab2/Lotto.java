package agh.po.lab2;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {

        ArrayList<Integer> typy = new ArrayList<>();
        for (int i=0; i<6; i++) {
            typy.add(Integer.parseInt(args[i]));
        }

        ArrayList<Integer> wylosowane = new ArrayList<>();
        for (int i=0; i<6; i++) {
            int liczba = (int)(Math.random()*(49-1+1)+1);
            if (wylosowane.contains(liczba)){
                i--;
            } else {
                wylosowane.add(liczba);
            }
        }

        System.out.println("Twoje typy: " + typy);
        System.out.println("Wylosowane liczby: " + wylosowane);

        wylosowane.retainAll(typy);

        int liczba_trafionych = wylosowane.size();
        System.out.println("Liczba trafien: " + liczba_trafionych);

    }
}
