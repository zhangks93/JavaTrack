import java.util.ArrayList;
import java.util.List;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Series {
    String numbers;

    public Series(String numbers) {
        this.numbers = numbers;
    }

    public List<String> slices(int i) throws IllegalArgumentException{
        if(i > numbers.length()) throw new IllegalArgumentException("Slice size is too big.");
        if(i < 1) throw new IllegalArgumentException("Slice size is too small.");
        List<String> result = new ArrayList<>();
        for (int start = 0; start + i <= numbers.length(); start++){
            result.add(numbers.substring(start,start+i));
        }
        return result;
    }
}
