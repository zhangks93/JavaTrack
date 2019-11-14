import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Yacht {
    int[] dice;
    YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Arrays.sort(dice);
        System.out.println(dice);
        this.dice = dice;
        System.out.println(this.dice);
        this.yachtCategory = yachtCategory;
    }

    int score() {

        switch (this.yachtCategory){
            case YACHT: return IntStream.of(dice).filter(item -> item ==dice[0]).sum() == dice[0]*5 ? 50:0;
            case LITTLE_STRAIGHT: if (dice.equals(new int[] {1, 2, 3, 4, 5})) return 30;break;
            case BIG_STRAIGHT: if (dice.equals(dice.equals(new int[]{2, 3, 4, 5, 6}))) return 30;break;
            case ONES: return IntStream.of(dice).filter(item -> item == 1).sum();
            case TWOS: return IntStream.of(dice).filter(item -> item == 2).sum();
            case THREES: return IntStream.of(dice).filter(item -> item == 3).sum();
            case FOURS: return IntStream.of(dice).filter(item -> item == 4).sum();
            case FIVES: return IntStream.of(dice).filter(item -> item == 5).sum();
            case SIXES: return IntStream.of(dice).filter(item -> item == 6).sum();
            case CHOICE: return IntStream.of(dice).sum();
            case FULL_HOUSE: return 0;
            case FOUR_OF_A_KIND: return IntStream.of(dice).sum() - IntStream.of(dice).distinct().sum();
        }
        return 0;
    }

}
