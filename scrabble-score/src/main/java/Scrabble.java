import java.util.*;

class Scrabble {

    char[] word;
    Map<Character,Integer> map = new HashMap<>() {
    };

    Scrabble(String word) {
        this.word = word.toUpperCase().toCharArray();

        initialMap("AEIOULNRST",1);
        initialMap("DG",2);
        initialMap("BCMP",3);
        initialMap("FHVWY",4);
        initialMap("K",5);
        initialMap("JX",8);
        initialMap("QZ",10);

    }

    private void initialMap(String list, int value) {
        list.chars().forEach(letter -> map.put((char)letter,value));
    }

    int getScore() {
        return new String(word).chars().map(item -> map.get((char)item)).sum();
    }



}
