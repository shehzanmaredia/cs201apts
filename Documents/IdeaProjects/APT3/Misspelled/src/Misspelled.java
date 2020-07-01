import java.util.Arrays;

public class Misspelled {
    public int howMany(String[] words, String[] dictionary) {
        // write code here
        int count = 0;
        for (String x : words)
        {
            if (!(Arrays.asList(dictionary).contains(x)))
            {
                count ++;
            }
        }
        return count;
    }
}