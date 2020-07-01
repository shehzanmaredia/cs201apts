import java.util.*;

public class BigWord {
    public String most(String[] sentences) {
        HashMap<String,Integer> words = new HashMap<>();
        for(String sent: sentences){
            String[] wrds = sent.split(" ");
            for(String a: wrds){
                String i = a.toLowerCase();
                if(!words.containsKey(i)){
                    words.put(i,1);
                }else{
                    words.put(i, words.get(i) + 1);
                }
            }
        }
        for (java.util.Map.Entry<String, Integer> entry : words.entrySet()) {
            int maxValueInMap=(Collections.max(words.values())); //find max value
            if (entry.getValue()==maxValueInMap) {
                return entry.getKey().toString();     //return key with max value
            }
        }
        return "";
    }
}