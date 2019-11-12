class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int n) {

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return n*n*(n+1)*(n+1)/4;
    }

    int computeSumOfSquaresTo(int n) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return n*(n+1)*(2*n+1)/6;
    }

    int computeDifferenceOfSquares(int input) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
