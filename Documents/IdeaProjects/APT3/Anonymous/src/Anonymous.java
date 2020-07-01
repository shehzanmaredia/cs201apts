public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        // fill in code here

        //count variable
        int count = 0;

        //makes arrays to lowercase
        for (int i = 0; i < headlines.length; i++) {
            headlines[i] = headlines[i].toLowerCase();
        }
        for (int i = 0; i < messages.length; i++) {
            messages[i] = messages[i].toLowerCase();
        }

        //create a new array
        // put that array through headlines and see how many of each word headlines has
        int[] arrayh = new int[300];
        arrayh = counts(headlines);
        arrayh[32] = Integer.MAX_VALUE;

        int[] arraym1 = new int[300];
        String[] arraym = new String[1];


        // go through each string in message
        for (String j : messages)
        {
            boolean truth = true;
            arraym[0] = j;
            arraym1 = counts(arraym);
            for (int n = 0; n<arraym1.length; n++)
            {
                if (arraym1[n]>arrayh[n]) {
                    truth = false;
                }
            }
            if (truth)
            {
                count++;
            }
        }
        // make a one length array with that string as the value
        // put that array through the count method
        // see if everything in that array is less than everything in headlines array
        // if so, count ++
        return count;
    }
    private int[] counts(String[] a)
    {
        int[] counta = new int[300];
        for (String x : a)
        {
            for (int i = 0; i< x.length(); i++)
            {
                char ch = x.charAt(i);
                counta[ch] += 1;
            }
        }
        return counta;
    }
}
