import java.util.*;

public class WordLadder {
    public boolean oneAway(String a, String b){
        if (a.length() != b.length()) return false;
        int diff = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) != b.charAt(i)){
                diff++;
            }
        }
        if (diff == 1) return true;
        return false;
    }

    public String ladderExists(String[] words, String from, String to) {
        Queue<String> q = new LinkedList<>();
        String current = ""; //create empty string
        q.add(to); //add to string to queue
        while (q.size() != 0){
            current = q.remove(); //remove from front of queue
            for(String w:words){
                if (oneAway(current, w)) q.add(w); //if current and any other word are one letter off, then add word to queue
            }
            if (oneAway(current, to)) return "ladder"; //see if you are one away from the end
        }
        return "none";
    }
}