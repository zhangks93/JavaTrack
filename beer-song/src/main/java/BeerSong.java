/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

public class BeerSong {

    public String sing(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (; b > 0; b--){
            sb.append(getItem(a));
            a = a-1;
        }

        return sb.toString();

    }

    public String singSong(){
        return sing(99,100);
    }

    String  getItem (int a) {
        if (a == 2) return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
        if (a == 1) return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        if (a == 0) return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
        return a + " bottles of beer on the wall, " + a + " bottles of beer.\n" +
                "Take one down and pass it around, " + (a-1) + " bottles of beer on the wall.\n\n";
    }
}
