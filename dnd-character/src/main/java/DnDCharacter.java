import java.util.stream.Stream;

class DnDCharacter {

    public DnDCharacter() {
    }

    int ability() {
        return 5;
    }

    int modifier(int input) {
          return (input - 10)/2;
    }

    int getStrength() {
        int[] dices = {0, 0, 0, 0};
        dices[0] = (int) (Math.random()*6 +1);
        dices[1] = (int) (Math.random()*6 +1);
        dices[2] = (int) (Math.random()*6 +1);
        dices[3] = (int) (Math.random()*6 +1);
        return
    }

    int getDexterity() {
          
    }

    int getConstitution() {
          
    }

    int getIntelligence() {
          
    }

    int getWisdom() {
          
    }

    int getCharisma() {
          
    }

    int getHitpoints() {
          
    }

}
