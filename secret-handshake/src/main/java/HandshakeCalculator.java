import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    final Signal[] signals = {Signal.WINK,Signal.DOUBLE_BLINK,Signal.CLOSE_YOUR_EYES, Signal.JUMP };

    public List<Signal> calculateHandshake(int number) {
        List<Signal> result = new ArrayList<>();

        if (number >> 4 == 1){
            number = number - 16;
            return addSignal(result, number);
        }else{
            Collections.reverse(addSignal(result,number));
            return result;
        }
    }

    List<Signal> addSignal(List<Signal> list, int number ) {
        for (int i = 3; i >= 0; i--){
            if(number >> i == 1) {list.add(signals[i]);number = number - (int) Math.pow(2,i);}
        }
        return list;
    }

}
