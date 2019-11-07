class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuffer result = new StringBuffer();
        if (inputString.length() == 0) return "";
        for (int i = inputString.length()-1; i >= 0; i--){
            result = result.append(inputString.charAt(i));
        }
        return result.toString();
    }
  
}