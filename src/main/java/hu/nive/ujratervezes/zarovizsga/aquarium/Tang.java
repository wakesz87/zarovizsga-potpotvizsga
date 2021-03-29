//Minden halnak van neve, súlya grammban és színe.
//Emellett minden hal számára elérhetőek az alábbi metódusok:
//status(): adja vissza a hal adatait egy Stringben, pl Dory, weight: 9, color: blue, short-term memory loss: true
//feed(): megnöveli a hal súlyát, a pontos implementáció a hal fajtájától függ.
//A tang 1 grammot hízik etetéskor, és rövidtávú-memória zavarban szenvedhet.

package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang  extends Fish{
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    public void feed(){
        this.weight += 1;
    }

    @Override
    public String status() {
        return getName() + ", "  + "weight: " + getWeight() + ", color: " + getColor() + ", " + "term memory loss: " + isMemoryLoss();
    }
}
