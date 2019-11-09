class Proverb {

    String[] words;


    Proverb(String[] words) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.words = words;
    }

    String recite() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (words.length == 0) return "";
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < words.length-1; i++){
            sb.append("For want of a " + words[i] + " the " +words[i+1]+ " was lost.\n");
        }
        sb.append("And all for the want of a " + words[0] +".");
        return sb.toString();
    }

}
