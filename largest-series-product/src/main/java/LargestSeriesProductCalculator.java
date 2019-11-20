

class LargestSeriesProductCalculator {

    int[] list;

    LargestSeriesProductCalculator(String inputNumber) {
        char[] arrays = inputNumber.toCharArray();
        list = new int[inputNumber.length()];

        for (int i = 0; i < arrays.length; i++){
            char item = arrays[i];
            if (item > '9' || item <'0') throw new IllegalArgumentException("String to search may only contain digits.");
            list[i] = Character.getNumericValue(item);
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        if (numberOfDigits < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        if (numberOfDigits > list.length) throw  new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        int result = 0;
        for (int i = 0; i + numberOfDigits  <=  list.length; i++){
            int multiply = 1;
            for (int j = i; j <= i + numberOfDigits - 1; j++){
                multiply = multiply * list[j];
            }
            if(multiply > result) result = multiply;
        }
        return result;
    }
}
