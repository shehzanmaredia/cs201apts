import java.util.Arrays;
import java.util.HashSet;

public class Starter {
        public int begins(String[] words, String first) {
            // replace this code
            int total = 0;
            HashSet<String> words1 = new HashSet<String>(Arrays.asList(words));
            //make hashset
            //go through each string in hashset
            for (String x : words1)
            {
                if(x.substring(0,1).equals(first))
                {
                    total ++;
                }
            }
            // see if chatat0.equalsfirst
            //if does add 1
            return total;
        }
}
