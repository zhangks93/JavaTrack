class TwelveDays {
    String[] gifts = new String[] {"twelve Drummers Drumming",
    "eleven Pipers Piping",
    "ten Lords-a-Leaping",
    "nine Ladies Dancing",
    "eight Maids-a-Milking",
    "seven Swans-a-Swimming",
    "six Geese-a-Laying",
    "five Gold Rings",
    "four Calling Birds",
    "three French Hens",
    "two Turtle Doves",
    "a Partridge in a Pear Tree"};

    String[] sequence = new String[] {"twelfth","eleventh","tenth","ninth","eighth","seventh","sixth",
                                    "fifth","fourth","third","second","first"};


    String verse(int verseNumber) {
        return "On the " +  this.sequence[12-verseNumber] +" day of Christmas my true love gave to me: "+ getGifts(verseNumber);

    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++){
            if (i == endVerse) {
                sb.append(this.verse(i));
            }else {
                sb.append(this.verse(i)).append("\n");
            }
        }
        return sb.toString();
    }
    
    String sing() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 12 ; i++){
            if (i == 12) {
                sb.append(this.verse(i));
            }else {
                sb.append(this.verse(i)).append("\n");
            }
        }
        return sb.toString();
    }

    String getGifts(int number) {
        StringBuilder sb = new StringBuilder();
        for (;number > 0 ; number --){
            if (number == 1) {
                sb.append(this.gifts[12-number]).append(".\n");
            }else if (number -1 == 1){
                sb.append(this.gifts[12-number]).append(", and ");
            }else{
                sb.append(this.gifts[12-number]).append(", ");
            }
        }
        String s = sb.toString();
        return s;
    }
}
