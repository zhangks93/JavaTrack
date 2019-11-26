class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int sum = 0;
        String string  = stringToVerify.replaceAll("-","");
        System.out.println(string);
        char[] arrays = string.toCharArray();
        if (arrays.length != 10) return false;
        for (int i = 0; i < arrays.length; i++){
            System.out.println(sum);
            if (arrays[i] >= '0' && arrays[i] <= '9' ){
                sum = sum + Integer.valueOf(String.valueOf(arrays[i]))*(10-i);
            }else if (arrays[i] == 'X') {
                sum = sum + 10*(10-i);
            }else{
                return false;
            }
        }
        System.out.println(sum);
        return (sum % 11 == 0)? true:false;
    }

}
