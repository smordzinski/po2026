package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void fillZoo(){

        for(int i=0; i<animals.length; i++){
            int wylosowana = (int)(Math.random()*(2-0+1)+0);

            switch (wylosowana){
                case 0:
                    animals[i] = new Dog("Reksio" + i);
                    break;
                case 1:
                    animals[i] = new Parrot("Papuga" + i);
                    break;
                case 2:
                    animals[i] = new Snake("Wąż" + i);
                    break;
            }
        }
    }

    public int getSumLegs(){
        int sum=0;
        for (int i=0; i<animals.length; i++) {
            sum += animals[i].getLegs();
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillZoo();

        System.out.println("Łączna liczba nóg zwierząt: " + zoo.getSumLegs());
        System.out.println("Pierwsze 10 zwierząt: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(zoo.animals[i].getDescription());
        }
    }

}
