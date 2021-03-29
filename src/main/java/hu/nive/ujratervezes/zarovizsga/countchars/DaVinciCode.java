//Hozdd létre a DaVinciCode osztályt, és abban a decode metódust, ami paraméternek várja egy file elérési útját
// és a keresett karaktert, ami lehet '0', '1' vagy 'x'.
//Ha paraméterként nem ezen karakterek egyikét kapja, akkor dobjon egy kivételt!
//A fájl 0, 1 és x karaktereket tartalmaz. A metódus térjen vissza azzal, hogy a második paraméterben kapott karakter hányszor szerepel a fájlban.
package hu.nive.ujratervezes.zarovizsga.countchars;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String name , char c){
        if(!(c == '0' || c == '1' || c == 'x')){
            throw new IllegalArgumentException("Wrong Input");
        }
        int counts = 0;


        try{
            String text= Files.readString(Path.of(name));

            if (text == "" || !containsCharacter(text, c)) {
                return 0;
            }
            for(char item: text.toCharArray()){
                if(item==c);
                counts++;
            }
        }catch (IIOException e){
            throw new IllegalArgumentException("can't read file", e);
        } catch (IOException e) {

        }
        return counts;
    }

    private boolean containsCharacter(String text, char c) {
        for(char item : text.toCharArray()){
            if(item==c){
                return true;
            }

        }
        return false;
    }


}
