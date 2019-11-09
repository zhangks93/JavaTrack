import java.util.HashMap;

class LuhnValidator {

    boolean isValid(String candidate) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        candidate = candidate.replaceAll(" ","");
        if(candidate.length() <= 1) return false;
        for (char i : candidate.toCharArray()){

            if (i > '9' || i <'0') return false;
        }
        String doubled = Double(candidate);
        if(calculate(doubled) % 10 == 0) {
            return true;
        }else{
            return false;
        }

    }

    int calculate(String numbers){
        int result = 0;
        for (char i : numbers.toCharArray()){
            result = result + Character.getNumericValue(i);
        }
        return result;
    }

    String Double(String numbers){
        StringBuilder sb = new StringBuilder();
        for (int i = numbers.length()-1; i >= 0; i--){
            if ((numbers.length()-i) % 2 == 0){
                if (numbers.charAt(i) == '0'){
                    sb.append('0');
                    continue;
                }
                sb.append(Integer.toString((Character.getNumericValue(numbers.charAt(i)) * 2 -1 ) % 9 + 1));
            }else{
                sb.append(numbers.charAt(i));
            }
        }
        return sb.toString();
    }

}
