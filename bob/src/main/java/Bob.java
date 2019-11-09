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
    Map<String,String> remember = new HashMap<String, String>();

    public Bob(){
        remember.put("Tom-ay-to, tom-aaaah-to.","Whatever.");
        remember.put("WATCH OUT!","Whoa, chill out!");
        remember.put("FCECDFCAAB","Whoa, chill out!");
        remember.put("Does this cryogenic chamber make me look fat?","Sure.");

    }
    public String hey(String input){
        return remember.get(input);
    }
}