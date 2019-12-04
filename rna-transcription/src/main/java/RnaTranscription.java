import java.util.HashMap;

class RnaTranscription {

    HashMap<String,String> map;

    public RnaTranscription() {
        this.map = new HashMap<>();
        map.put("A" ,"U");
        map.put("T", "A");
        map.put("G", "C");
        map.put("C", "G");
    }

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            sb.append(map.get(String.valueOf(dnaStrand.charAt(i))));
        }

        return sb.toString();
    }

}
