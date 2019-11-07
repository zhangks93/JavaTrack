class Hamming {
    String leftStrand;
    String rightStrand;
    Hamming(String leftStrand, String rightStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (leftStrand == "" && rightStrand != "") throw new IllegalArgumentException("left strand must not be empty.");
        if (leftStrand != "" && rightStrand == "") throw new IllegalArgumentException("right strand must not be empty.");

        if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }else {
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        }
    }

    int getHammingDistance() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int result = 0;
        for ( int i = 0; i < leftStrand.length(); i++){
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) result = result + 1;
        }
        return result;
    }

}
