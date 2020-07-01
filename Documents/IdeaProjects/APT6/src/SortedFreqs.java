import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        // fill in code here
        ArrayList<String> al = new ArrayList<>(Arrays.asList(data));
        TreeSet<String> ts = new TreeSet<>(al);
        ArrayList<Integer> freqlist = new ArrayList<>();
        for(String s : ts){
            freqlist.add(Collections.frequency(al, s));
        }
        return freqlist.toArray(new int[0]);

       //int[] ret = freqlist.toArray(new int[0]);
        /*new int[freqlist.size()];
        for(int i = 0; i < ret.length; i++){
            ret[i] = freqlist.get(i).intValue();
        }
        return ret;*/
    }
}