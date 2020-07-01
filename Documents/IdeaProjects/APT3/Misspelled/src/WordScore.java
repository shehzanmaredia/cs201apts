public class WordScore {
    public int[] score(String[] words, String want, String avoid) {
        // replace with your code

        //split want into array
        //split avoid into array
        //for each in wrods
        //

        char[] wantArr = want.toCharArray();
        char[] avoidArr = avoid.toCharArray();
        int[] scores = new int[words.length];
        int index = 0;
        for (String x : words)
        {
            int score = 0;
            char[] temparr = x.toCharArray();
            for (char z : temparr)
            {
                boolean found = false;
                boolean found1 = false;
                for (int p = 0; p<wantArr.length; p++)
                {
                    if(z == wantArr[p])
                    {
                       found = true;
                    }

                }
                if (found) {
                    score++;
                }

                for (int l = 0; l<avoidArr.length; l++)
                {
                    if(z == avoidArr[l])
                    {
                        found1 = true;
                    }
                }
                if (found1) {
                    score--;
                }
            }
            scores[index] = score;
            index++;

        }

        return scores;
    }
}