public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        // change this code
        int[] array = new int[words.length];
        int length = str.length();
        //create an array x of words that are in string
        String strArray[] = str.split(" ");
        //go through each word in words
        int index = 0;
        for (String x : words)
        {
            int total = 0;
            for (String y : strArray)
            {
                if(x.equals(y))
                {
                    total++;
                }
            }
            array[index] = total;
            index++;
        }
        //go through each word y in x
        //if word is equal to y add to total
        //add total to array index spot
        //return total
        return array;
    }
}
