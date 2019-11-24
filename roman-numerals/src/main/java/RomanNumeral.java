/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class RomanNumeral {
     int number ;
     String[][] map = {{"I", "V"}, {"X", "L"}, {"C", "D"}, {"M",""}, {"", ""}};

    public RomanNumeral(int number) {
        this.number = number;
    }

    public String getRomanNumeral() {
        StringBuilder result = new StringBuilder();
        char[] arrays = String.valueOf(number).toCharArray();
        int length = arrays.length;
        for (int i = 0; i < length; i++ ){
            result.append(roma(Integer.valueOf(String.valueOf(arrays[i])), this.map[length-i-1][0], this.map[length-i-1][1],this.map[length-i][0]));
        }
        return result.toString();
    }

    String roma (int num, String i, String v, String t) {
            if (num == 0) return "";
            if (num == 1) return i;
            if (num == 2) return i+i;
            if (num == 3) return i+i+i;
            if (num == 9) return i+t;
            if (num == 5) return v;
            int diff = Math.abs(5 -num);
            StringBuilder sb = new StringBuilder();
            while (diff > 0) {
                sb.append(i);
                diff--;
            }
            return 5 - num < 0? v + sb.toString() : sb.append(v).toString();
    }

}
