import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String binary = binaryFromDecimal(number);

        if (binary.length() == 5){
            List<Signal> result = returnUnreversed(binary.substring(1));
            Collections.reverse(result);
            return result;
        }else{
            return returnUnreversed(binary);
        }
    }

    String binaryFromDecimal(int n){
        String str = "";
        while(n!=0){
            str = n%2+str;
            n = n/2;
        }
        return (str.equals(""))? "0":str;
    }

    List<Signal> returnUnreversed(String binary){
        binary = "000" + binary;
        binary = binary.substring(binary.length()-4);

        List<Signal> result = new ArrayList<>();
        if (binary.charAt(3) == '1') result.add(Signal.WINK);
        if (binary.charAt(2) == '1') result.add(Signal.DOUBLE_BLINK);
        if (binary.charAt(1) == '1') result.add(Signal.CLOSE_YOUR_EYES);
        if (binary.charAt(0) == '1') result.add(Signal.JUMP);

        return result;
    }
}
