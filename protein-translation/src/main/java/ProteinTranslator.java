import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {
    Map<String,String> map = new HashMap<>();

    public ProteinTranslator() {
        this.map.put("AUG","Methionine");
        this.map.put("UUU","Phenylalanine");
        this.map.put("UUC","Phenylalanine");
        this.map.put("UUA","Leucine");
        this.map.put("UUG","Leucine");
        this.map.put("UCU","Serine");
        this.map.put("UCC","Serine");
        this.map.put("UCA","Serine");
        this.map.put("UCG","Serine");
        this.map.put("UAU","Tyrosine");
        this.map.put("UAC","Tyrosine");
        this.map.put("UGU","Cysteine");
        this.map.put("UGC","Cysteine");
        this.map.put("UGG","Tryptophan");
        this.map.put("UAA","STOP");
        this.map.put("UAG","STOP");
        this.map.put("UGA","STOP");
    }


    List<String> translate(String rnaSequence) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i+2 < rnaSequence.length(); i=i+3){
            if (! map.containsKey(rnaSequence.substring(i,i+3))) continue;
            if (map.get(rnaSequence.substring(i,i+3)).equals("STOP")) break;
            list.add(map.get(rnaSequence.substring(i,i+3)));
        }
        return list;
    }
}