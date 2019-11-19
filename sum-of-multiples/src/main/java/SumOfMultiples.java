import java.util.*;
import java.util.stream.Stream;

class SumOfMultiples {

    int base;
    int[] set;

    SumOfMultiples(int number, int[] set) {
        base = number;
        this.set = set;
    }

    int getSum() {
       List<Integer> sum = new ArrayList<>();
       List<Integer> set = new ArrayList<>();

       for (int i : this.set){
           if (i != 0) set.add(i);
       }

       if (set.size() == 0) return 0;

       Set<Integer> result = new HashSet<>();
       for (int k = 0; k < set.size(); k++) {
           for (int i = set.get(k); i < this.base; i = i + set.get(k)) {
               result.add(i);
           }
       }
       int sumofresult = 0;
       Iterator<Integer> iterator = result.iterator();
       while (iterator.hasNext()){
           sumofresult = sumofresult + iterator.next();
       }
       return sumofresult;

    }

}
