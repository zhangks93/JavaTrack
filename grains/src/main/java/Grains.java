import java.math.BigInteger;

class Grains {


    BigInteger grainsOnSquare(final int square) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (square<1 || square>64) throw new IllegalArgumentException( "square must be between 1 and 64");
        if (square == 64) return new BigInteger(String.valueOf((long)Math.pow(2,62))).add(new BigInteger(String.valueOf((long)Math.pow(2,62))));
        return new BigInteger(String.valueOf((long)Math.pow(2,square-1)));
    }

    BigInteger grainsOnBoard() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new BigInteger(String.valueOf("18446744073709551615"));
    }

}
