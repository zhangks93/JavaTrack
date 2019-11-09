/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class House {
    String[] rhyme = {"This is the house that Jack built.\n",
            "This is the malt " +
            "that lay in the house that Jack built.\n",
            "This is the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the maiden all forlorn " +
            "that milked the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the man all tattered and torn " +
            "that kissed the maiden all forlorn " +
            "that milked the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the priest all shaven and shorn " +
            "that married the man all tattered and torn " +
            "that kissed the maiden all forlorn " +
            "that milked the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the rooster that crowed in the morn " +
            "that woke the priest all shaven and shorn " +
            "that married the man all tattered and torn " +
            "that kissed the maiden all forlorn " +
            "that milked the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the farmer sowing his corn " +
            "that kept the rooster that crowed in the morn " +
            "that woke the priest all shaven and shorn " +
            "that married the man all tattered and torn " +
            "that kissed the maiden all forlorn " +
            "that milked the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built.\n",
            "This is the horse and the hound and the horn " +
            "that belonged to the farmer sowing his corn " +
            "that kept the rooster that crowed in the morn " +
            "that woke the priest all shaven and shorn " +
            "that married the man all tattered and torn " +
            "that kissed the maiden all forlorn " +
            "that milked the cow with the crumpled horn " +
            "that tossed the dog " +
            "that worried the cat " +
            "that killed the rat " +
            "that ate the malt " +
            "that lay in the house that Jack built."};

    public House(){
    }

    public String sing(){
        StringBuilder sb = new StringBuilder();
        for (String i:rhyme){
            sb.append(i);
        }
        return sb.toString();
    }

    public String verse(int verse){
        if (verse == 12){
            return rhyme[verse-1];

        }else{
            return rhyme[verse-1].substring(0,rhyme[verse-1].length()-1);
        }
    }

    public String verses(int start, int end){
        StringBuilder sb = new StringBuilder();
        for (int i = start-1 ; i <= end-1; i++){
            sb.append(rhyme[i]);
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }
}
