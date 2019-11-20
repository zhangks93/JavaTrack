import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    Map<String,Integer> map;

    public ResistorColorDuo( ) {
        this.map = new HashMap<>();
        String[] colors = {"black", "brown", "red", "orange", "yellow",
                "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < colors.length; i++) {
            this.map.put(colors[i], i);
        }
    }

    int value(String[] colors) {
        int sum = 0;
        sum += this.map.get(colors[0])*10;
        sum += this.map.get(colors[1]);
        return sum;
    }
}
