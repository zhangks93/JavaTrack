class RaindropConverter {

    String convert(int number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String result = "";
        if (number % 3 ==0) result = result + "Pling";
        if (number % 5 ==0) result = result + "Plang";
        if (number % 7 ==0) result = result + "Plong";
        return result.equals("")? Integer.toString(number):result;
    }

}
