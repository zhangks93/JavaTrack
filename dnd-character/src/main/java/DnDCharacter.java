import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class DnDCharacter {

    int[] ability = {0,0,0,0,0,0};

    public DnDCharacter() {
        for (int i = 0; i < 6; i++){
            ability[i] = calculate();
        }
    }

    int ability() {
        return 5;
    }

    int modifier(int input) {
        float temp = (float) (input - 10) / 2;
        return (temp < 0) ?  (int) Math.floor(temp) : (int) temp;

    }

    int getStrength() {
        return ability[0];
    }

    int getDexterity() {
        return ability[1];
    }

    int getConstitution() {
        return ability[2];
    }

    int getIntelligence() {
        return ability[3];
    }

    int getWisdom() {
        return ability[4];
    }

    int getCharisma() {
        return ability[5];
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

    int calculate(){
        int sum = 0;
        int min = 6;
        for (int i = 0 ; i < 4 ; i++){
            int temp = (int) (Math.random() * 5) + 1;
            if (temp < min) min = temp;
            sum = sum + temp;
        }
        return sum - min;
    }

}
