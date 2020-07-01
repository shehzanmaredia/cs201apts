public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int maxnum = 0; // most occurenes of nuc in strand
        int indexof = 0; // index of the string w maxnum
        char nucs = nuc.charAt(0); //parsing
        int maxlength = 0; //used for if strings have same maxnum but diff lengths
        for (int j = 0; j < strands.length; j++) {
            int counts = 0;
            int lengthof = strands[j].length();
            for (int i = 0; i < strands[j].length(); i++) {
                if (strands[j].charAt(i) == nucs) {
                    counts++;
                }

            }
            if (counts > maxnum) {

                maxnum = counts;
                indexof = j;
                maxlength = lengthof;
            }
            else if ( counts == maxnum )
            {
                if (lengthof > maxlength)
                {
                    maxnum = counts;
                    indexof = j;
                    maxlength = lengthof;
                }
            }

        }
        if ( maxnum == 0)
        {
            return "";
        }
        return strands[indexof];
    }

}
