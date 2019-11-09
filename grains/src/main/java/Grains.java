import java.math.BigInteger;

class Grains {


    BigInteger grainsOnSquare(final int square) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new BigInteger(String.valueOf((long)Math.pow(2,square-1)));
    }

    BigInteger grainsOnBoard() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new BigInteger(String.valueOf(2));
    }

}
