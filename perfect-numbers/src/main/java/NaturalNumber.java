class NaturalNumber {

    int number ;

    public NaturalNumber(int number) throws IllegalArgumentException {
        if (number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    public Classification getClassification(){
        if (this.number == 1) return Classification.DEFICIENT;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(this.number); i++){
            if (this.number % i == 0) {
                if (i == this.number / i) {
                    sum = sum + i;
                }else{
                    sum = sum + i + this.number/i;
                }
            }
        }
        if ( sum == this.number) return Classification.PERFECT;
        if ( sum < this.number) return Classification.DEFICIENT;
        if ( sum > this.number) return Classification.ABUNDANT;
        return null;
    }
}
