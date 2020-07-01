import java.util.*;

public class SortByFreqs {

    public String[] sort(String[] data) {
        Map<String, Integer> tally = new TreeMap<>();
        for (String s : data){
            tally.putIfAbsent(s,0);
            tally.put(s, tally.get(s)+1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(tally.entrySet());
        Collections.sort(list, Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)));
        String[] ret = new String[tally.keySet().size()];
        int counter = 0;
        for (Map.Entry<String, Integer> item : list) {
            ret[counter] = item.getKey();
            counter++;
        }
        return ret;
    }


}


