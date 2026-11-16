package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void fillZoo(){

        for(int i=0; i<animals.length; i++){
            int wylosowana = (int)(Math.random()*(2-0+1)+0);

            switch (wylosowana){
                case 1:
                    animals[i]
            }
        }
    }
}
