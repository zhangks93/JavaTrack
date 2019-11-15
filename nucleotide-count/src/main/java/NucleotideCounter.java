/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {
    String DNA;
    Map<Character, Integer> map;

    public NucleotideCounter(String DNA) throws IllegalArgumentException{
        this.DNA = DNA;
        for (char i : DNA.toCharArray()) {
            if (i == 'X') throw new IllegalArgumentException();
        }
        this.map = new HashMap<>();
        this.map.put('A', 0);
        this.map.put('T', 0);
        this.map.put('G', 0);
        this.map.put('C', 0);
    }

    public Map<Character, Integer> nucleotideCounts()  {
            char[] chars = DNA.toCharArray();

            for (char i : map.keySet()) {
                int x = 0;
                for (char j : chars) {
                    if (j == i) x += 1;
                }
                map.replace(i, x);
            }

            return map;
    }

}
