/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

public class Queen {

    int x;
    int y;

    public Queen(int x, int y) {
        if (x > 7) throw new IllegalArgumentException("Queen position must have row <= 7.");
        if (x < 0) throw new IllegalArgumentException("Queen position must have positive row.");
        if (y > 7) throw new IllegalArgumentException("Queen position must have column <= 7.");
        if (y < 0) throw new IllegalArgumentException("Queen position must have positive column.");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
