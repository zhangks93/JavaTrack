public class QueenAttackCalculator {

    Queen[] queens;

    public QueenAttackCalculator(Queen queen1, Queen queen2) {
        if (queen1 == null || queen2 == null) throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        if (queen1.getX() == queen2.getX() && queen1.getY() == queen2.getY()) throw  new IllegalArgumentException("Queens cannot occupy the same position.");
        this.queens = new Queen[]{queen1, queen2};
    }

    public boolean canQueensAttackOneAnother() {
        if (queens[0].getX() == queens[1].getX()) return true;
        if (queens[0].getY() == queens[1].getY()) return true;
        if ((queens[0].getX() - queens[0].getY()) == (queens[1].getX() - queens[1].getY())) return true;
        if ((queens[0].getX() + queens[0].getY()) == (queens[1].getX() + queens[1].getY())) return true;
        return false;
    }
}
