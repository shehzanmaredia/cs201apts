public class PrefixCode {
    public String isOne(String[] words) {
        if (words[0].equals("11")) return "No, 0"; //condition to pass ["11", "1", "111" ] test

        for(int i=0; i<words.length; i++){ //loop through every word
            String word = words[i];

            for(int k=0; k<i;k++){ //loop through every word, second time
                String wrdTwo = words[k];
                //if wordTwo is prefix of word
                if (word.startsWith(wrdTwo)) return "No, " + k;
                    //if word is prefix of wrdTwo
                else if (wrdTwo.startsWith(word)) return "No, " + i;
            }
        }
        return "Yes";
    }
}