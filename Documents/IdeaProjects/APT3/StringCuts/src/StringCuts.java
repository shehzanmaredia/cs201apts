import java.util.ArrayList;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        ArrayList<String> test1 = new ArrayList<String>();
        for(String s : list){
            if (s.length() >= minLength && !test1.contains(s)){
                test1.add(s);
            }
        }
        return test1.toArray(new String[0]);
    }
}