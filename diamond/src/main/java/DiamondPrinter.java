import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    char[] alphabet;

    public DiamondPrinter() {
        alphabet = new char[26];
        for (int i = 0 ; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
    }

    List<String> printToList(char a) {
        int length = 2 * (a - 'A') + 1;
        List<String> list = new ArrayList<>();
        int center = a - 'A';
        for (int i = 0; i < length; i++){
            char item = getChar(length,i);
            int[] positions;
            if (i <= center) {
                positions = new int[] {center + i, center - i};
            }else {
                positions = new int[] {i - center, 3 * center - i};
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (j == positions[0] || j == positions[1]){
                    sb.append(item);
                }else{
                    sb.append(' ');
                }
            }
            list.add(sb.toString());
        }
        return list;
    }

    char getChar(int length, int i) {
        if (i <= (length -1)/2) {
            return alphabet[i];
        }else {
            return alphabet[length - 1 -i];
        }
    }


}
