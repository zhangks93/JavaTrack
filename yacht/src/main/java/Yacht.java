import java.util.*;
import java.util.stream.IntStream;

class Yacht {
    int[] dice;
    YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Arrays.sort(dice);
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {

        switch (this.yachtCategory){
            case YACHT: return IntStream.of(dice).filter(item -> item ==dice[0]).sum() == dice[0]*5 ? 50:0;
            case LITTLE_STRAIGHT: if (isequal(dice,(new int[] {1, 2, 3, 4, 5}))) return 30;break;
            case BIG_STRAIGHT: if (isequal(dice,new int[] {2,3,4,5,6})) return 30;break;
            case ONES: return IntStream.of(dice).filter(item -> item == 1).sum();
            case TWOS: return IntStream.of(dice).filter(item -> item == 2).sum();
            case THREES: return IntStream.of(dice).filter(item -> item == 3).sum();
            case FOURS: return IntStream.of(dice).filter(item -> item == 4).sum();
            case FIVES: return IntStream.of(dice).filter(item -> item == 5).sum();
            case SIXES: return IntStream.of(dice).filter(item -> item == 6).sum();
            case CHOICE: return IntStream.of(dice).sum();
            case FULL_HOUSE: return isFull(dice)? IntStream.of(dice).sum():0;
            case FOUR_OF_A_KIND: return isFour(dice)? fourSum(dice):0;
        }
        return 0;
    }

    private boolean isFour(int[] list) {
        Set set = new HashSet();
        for (int item : list){
            set.add(item);
        }
        return ((set.size() == 2 && (list[0] < list[1] || list[3] < list[4]))|| set.size() == 1 );
    }

    private int fourSum(int[] list){
        if (list[0] == list[1]) return list[0]+list[1]+list[2]+list[3];
        if (list[3] == list[4]) return list[4]+list[1]+list[2]+list[3];
        return 0;
    }

    private boolean isequal(int[] dice, int[] ints) {
        if (dice.length != ints.length) return false;
        for (int i = 0; i < dice.length; i++){
            if (dice[i] != ints[i]) return false;
        }
        return true;
    }

    boolean isFull(int[] list){
        Set set = new HashSet();
        for (int item : list){
            set.add(item);
        }
        return (set.size() == 2 && (list[1] < list[2] || list[2] < list[3]));
    }

}
