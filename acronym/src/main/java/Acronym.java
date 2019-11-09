class Acronym {

    String phrase;

    Acronym(String phrase) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.phrase = phrase;
    }

    String get() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String[] splited = phrase.split(" |-");
        StringBuilder sb = new StringBuilder();
        for (String unit : splited){
            for (char i : unit.toUpperCase().toCharArray()){
                if (i >= 'A' && i <= 'Z') {
                    sb.append(i);
                    break;
                }

            }
        }
        return sb.toString();
    }

}
