import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Anagram {
    String item;

    public Anagram(String item) {
        this.item = item.toLowerCase();
    }

    public List<String> match(List<String> list){
        List<String> result = new ArrayList<>();
        String item_sorted = reSort(item);

        for (String a : list){
            if (item.equals(a.toLowerCase())) continue;
            if (item_sorted.equals(reSort(a.toLowerCase()))) result.add(a);
        }
        return result;
    }


    private  String reSort(String s){
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        String result="";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result;
    }

}
