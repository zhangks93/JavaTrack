import java.util.HashMap;

public class PangramChecker {

    HashMap<Character, Integer> map = new HashMap<>();

    public boolean isPangram(String input) {
        String inputs = input.toLowerCase();
        char[] arrays = inputs.toCharArray();

        for ( char i : arrays){
            if ((i >= 'a' && i <= 'z') && (! map.containsKey(i))) map.put(i,1);
        }

        return (map.size() == 26) ? true:false;
    }

}
