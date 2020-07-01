import java.util.HashSet;
import java.util.Set;

public class IsomorphicWords
{
    public int countPairs(String[] words)
    {
        // fill in code here
        int count = 0;

        //create an array which will hold String values which are integers
        String[] mapped = new String[words.length];

        //go through each string in words and give them that mapped value by calling function map
        for (int v = 0; v<words.length; v++)
        {
            mapped[v] = map(words[v]);
        }

        //check how many things in mapped are equal to each other
        for (int i = 0; i <mapped.length; i++)
        {
            for (int l = i+1; l <mapped.length; l++)
            {
                if(mapped[i].equals(mapped[l]))
                {
                    count++;
                }
            }
        }

        return count;
    }

//    public static void main(String[] args){
//        String[] t = {"abca", "zbxz", "opqr"};
//        System.out.println(countPairs(t));
//    }

//returns a string which has int counts so like abcd is 1234 or abda 1231
    private String map(String x)
    {
        String lax = "";
        int[] maps = new int[x.length()];
        int index = 1;
        for (int r = 0; r<maps.length; r++)
        {
            if (maps[r]==0)
            {
                maps[r] = index;
                for (int f = r+1; f<maps.length; f++)
                {
                    //if(Character.toString(x.charAt(r)).equals(Character.toString(x.charAt(f))))
                    if(x.charAt(r) == x.charAt(f))
                    {
                        maps[f]=index;
                    }
                }
                index++;
            }
        }

      for (int q : maps)
        {
            lax = lax + Integer.toString(q);
        }
        return lax;

    }


}
