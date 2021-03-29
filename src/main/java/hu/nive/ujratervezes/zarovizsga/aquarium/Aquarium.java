//Az Aquarium osztálynak az alábbi metódusai vannak:
//addFish(), amivel halakat lehet hozzáadni
//feed(), ami megeteti az összes halat az akváriumban, és ezzel megnöveli a súlyukat
//removeFish(), eltávolít minden olyan halat az akváriumból, ami legalább 11 grammos
//getStatus(), ami visszaadja a halak státuszát egy String listában
package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    List<Fish> fishList =new ArrayList<>();


    public void addFish(Fish fish){
        fishList.add(fish);
    }

    public void feed(){
        for(Fish i : fishList){
            i.feed();
        }
    }

    public void removeFish(){
        List<Fish> remove = new ArrayList<>();
        for(Fish i : fishList){
            if(i.getWeight() >= 11){
                remove.add(i);
            }
        }
        fishList.removeAll(remove);
    }

    public List<String> getStatus(){
        List<String> statusList = new ArrayList<>();
        for(Fish i : fishList){
            statusList.add(i.status());
        }
        return statusList;
    }
}
