import java.util.Arrays;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class FoodChain {
    private String[] rythm = {
                "I know an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a spider.\n" +
                "It wriggled and jiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a bird.\n" +
                "How absurd to swallow a bird!\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a cat.\n" +
                "Imagine that, to swallow a cat!\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a dog.\n" +
                "What a hog, to swallow a dog!\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a goat.\n" +
                "Just opened her throat and swallowed a goat!\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a cow.\n" +
                "I don't know how she swallowed a cow!\n" +
                "She swallowed the cow to catch the goat.\n" +
                "She swallowed the goat to catch the dog.\n" +
                "She swallowed the dog to catch the cat.\n" +
                "She swallowed the cat to catch the bird.\n" +
                "She swallowed the bird to catch the spider that wriggled and jiggled and " +
                "tickled inside her.\n" +
                "She swallowed the spider to catch the fly.\n" +
                "I don't know why she swallowed the fly. Perhaps she'll die.",

                "I know an old lady who swallowed a horse.\n" +
                "She's dead, of course!"};

    public FoodChain() {
    }

    public String verse(int input){
        return rythm[input-1];
    }

    public String verses(int start, int end){
         StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++){
            result.append("\n");
            result.append(rythm[i-1]+"\n");
        }
        result.delete(0,1);
        result.delete(result.length()-1,result.length());
        return result.toString();
    }

}
