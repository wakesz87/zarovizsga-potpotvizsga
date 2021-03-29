//Hozd létre a UniqueFinder osztályt, és abban a uniqueChars metódust, ami paraméternek kap egy String-et,
// és térjen vissza az abban levő karakterek listájával. Minden karakter csak egyszer szerepeljen a listában,
// az inputban nézett első előfordulásának megfelelő helyen.
//Ha a metódus null-t kap paraméterben, akkor dobj IllegalArgumentException-t!
package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String s){
        if(s == null || s.isBlank()){
            throw new IllegalArgumentException("Not empty");
        }
    List<Character> characterList = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(!characterList.contains(c)){
                characterList.add(c);
            }
        }
        return characterList;
    }





}
