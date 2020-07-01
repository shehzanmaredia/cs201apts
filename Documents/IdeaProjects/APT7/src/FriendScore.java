import java.util.ArrayList;
import java.util.HashSet;

public class FriendScore {
    public int twoFriends(int r, ArrayList<HashSet<Integer>> data){
        HashSet<Integer> s = new HashSet<>();
        for (Integer i: data.get(r)){
            s.addAll(data.get(i));
        }
        s.addAll(data.get(r));
        s.remove(r);
        return s.size();
    }

    public int highestScore(String[] friends) {
        ArrayList<HashSet<Integer>> data = new ArrayList<>();
        for (int r = 0; r < friends.length; r++) {
            data.add(new HashSet<>());
            for (int c = 0; c < friends[r].length(); c++) {
                if (friends[r].charAt(c) == 'Y')
                    data.get(r).add(c);
            }
        }
        int max = 0;
        for(int r=0; r < data.size(); r++){
            int r2 = twoFriends(r,data);
            if (r2 > max) max = r2;
        }
        return max;
    }
}