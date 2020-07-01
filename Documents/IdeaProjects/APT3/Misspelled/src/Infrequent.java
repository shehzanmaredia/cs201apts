import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Infrequent {
    public String find(String[] phrases){
        // write code here
        String x = String.join(" ", phrases);
        String[] array = x.split(" ");
        for (int y = 0; y<array.length; y++)
        {
            array[y] = array[y].toLowerCase();
        }
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(array));
        int min = 100000000;
        String leastFreq = "";
      //  int index = 0;
        for (int i = 0; i<al.size(); i++)
        {
            int c = Collections.frequency(al, al.get(i));
            if (c<min)
            {
               // index = i;
                leastFreq = al.get(i);
                min = c;

            }
        }

        return leastFreq;
    }
}