import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] values){
        // you write code here and replace statement below
        ArrayList<String> al = new ArrayList<>(Arrays.asList(values));
        Collections.sort(al, Comparator.comparing(String::length).thenComparing(String::compareTo));
        String[] ret = al.toArray(new String[0]);
        return ret;
    }
}