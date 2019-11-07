import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            Character unit = phrase.charAt(i);
            if (unit >= 'a' && unit <= 'z') {
                if (map.get(unit) == null) {
                    map.put(unit, 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}