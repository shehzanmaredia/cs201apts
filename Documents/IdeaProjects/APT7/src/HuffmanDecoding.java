public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        StringBuilder ret = new StringBuilder();
        int lastSuccessfulIndex = 0;
        for (int i = 0; i < archive.length()+1; i++){
            String currentString = archive.substring(lastSuccessfulIndex, i);
            char currentChar = 'A';
            for (String item : dictionary)
            {
                if (item.equals(currentString)){
                    ret.append(currentChar);
                    lastSuccessfulIndex = i;
                    break;
                }
                currentChar++;
            }
        }
        return ret.toString();
    }
}

