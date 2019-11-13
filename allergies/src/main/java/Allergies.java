import java.util.ArrayList;
import java.util.List;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Allergies {
    int num;

    public Allergies(int num) {
        this.num = num % 256;
    }

    public List<Allergen> getList(){
        List<Allergen> result = new ArrayList<>();
        String binary = decimalToBinary(this.num);
        if (binary.charAt(7) == '1') result.add(Allergen.EGGS);
        if (binary.charAt(6) == '1') result.add(Allergen.PEANUTS);
        if (binary.charAt(5) == '1') result.add(Allergen.SHELLFISH);
        if (binary.charAt(4) == '1') result.add(Allergen.STRAWBERRIES);
        if (binary.charAt(3) == '1') result.add(Allergen.TOMATOES);
        if (binary.charAt(2) == '1') result.add(Allergen.CHOCOLATE);
        if (binary.charAt(1) == '1') result.add(Allergen.POLLEN);
        if (binary.charAt(0) == '1') result.add(Allergen.CATS);

        return result;
    }

    public boolean isAllergicTo(Allergen allergen){
        return getList().contains(allergen);
    }

    String decimalToBinary(int decimal){
        StringBuilder sb = new StringBuilder();

        while (decimal >= 1){
            sb.append(decimal % 2);
            decimal = decimal / 2;
        }
        while (sb.length() <8){
            sb.append('0');
        }
        return sb.reverse().toString();
    }

}
