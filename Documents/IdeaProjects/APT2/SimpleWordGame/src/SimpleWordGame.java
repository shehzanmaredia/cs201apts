import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary)
    {
        int total = 0;
        // you write code here
        HashSet<String> wordsrem = new HashSet<String>(Arrays.asList(player));
        ArrayList<String> list1 =new ArrayList<String>(); //Creating arraylist
        for (String x: dictionary)
        {
            if (wordsrem.contains(x))
            {
                list1.add(x);
            }

        }

        for (String x1 : list1)
        {
            int length = x1.length();
            total += length * length;
        }

                //words remembered by player
        //if those words are in dictionary
        // add them to an array
        //total length of array squared and add to tal
        return total;

    }
}
