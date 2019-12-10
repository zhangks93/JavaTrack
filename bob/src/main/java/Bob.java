import java.util.HashMap;
import java.util.Map;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Bob {


    public Bob(){
    }
    public String hey(String inputString){
        if (inputString.toUpperCase().equals(inputString) && !inputString.toLowerCase().equals(inputString) && !inputString.trim().endsWith("?")) return "Whoa, chill out!";
        else if (inputString.toUpperCase().equals(inputString) && !inputString.toLowerCase().equals(inputString) && inputString.trim().endsWith("?")) return "Calm down, I know what I'm doing!";
        else if (inputString.trim().endsWith("?")) return "Sure.";
        else if (inputString.trim().equals("")) return "Fine. Be that way!";
        else return "Whatever.";
    }
}