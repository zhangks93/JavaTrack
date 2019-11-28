import java.util.ArrayList;
import java.util.List;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Bowling{

    List<Integer> rolls = new ArrayList<>();

    public Bowling() {
    }

    public void roll(int pins){
        if (pins < 0) throw  new IllegalArgumentException("Negative roll is invalid");
        if (pins > 10) throw new IllegalArgumentException("Pin count exceeds pins on the lane");
        rolls.add(pins);
    }

    public int score(){
        if (rolls.size() < 20 ) throw new IllegalStateException("Score cannot be taken until the end of the game");
        if (rolls.size() > 20 ) throw new IllegalStateException("Cannot roll after game is over");
        Integer[] arrays = (Integer[]) rolls.toArray();
        int sum = 0;
        if (arrays[0].intValue() == 10)
        if (arrays[1].intValue() == 10)
    }
}