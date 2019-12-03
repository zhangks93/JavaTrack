/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

public class PhoneNumber {
    String number;

    public PhoneNumber(String number) {
        String preprocessed = number.replace(" ", "")
                .replace(".","")
                .replace("(", "")
                .replace(")", "")
                .replace("-", "")
                .replace(" ","")
                .replace("+", "");
        if (preprocessed.length() < 10) throw new IllegalArgumentException("incorrect number of digits");
        if (preprocessed.length() > 11) throw new IllegalArgumentException("more than 11 digits");
        if (preprocessed.charAt(0) != '1'&& preprocessed.length() == 11) throw new IllegalArgumentException("11 digits must start with 1");
        if (preprocessed.charAt(0) == '1'&& preprocessed.length() == 11) preprocessed = preprocessed.substring(1);

        for (char i : preprocessed.toCharArray()) {
            if (i >= 'a' && i <='z') throw new IllegalArgumentException("letters not permitted");
            if (i > '9' || i <'0') throw new IllegalArgumentException("punctuations not permitted");
        }

        if (preprocessed.charAt(0) == '0') throw new IllegalArgumentException("area code cannot start with zero");
        if (preprocessed.charAt(0) == '1') throw new IllegalArgumentException("area code cannot start with one");
        if (preprocessed.charAt(3) == '0') throw new IllegalArgumentException("exchange code cannot start with zero");
        if (preprocessed.charAt(3) == '1') throw new IllegalArgumentException("exchange code cannot start with one");

        this.number = preprocessed;
    }

    public String getNumber() {
        return this.number;
    }
}
