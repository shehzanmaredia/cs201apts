import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Conflicts {
    public String[] conflict(String[] info){
        // write code here
        TreeSet<String> conflicts = new TreeSet<>();
        //process info 
        ArrayList<ArrayList<String>> total = new ArrayList<>();
        for(String s : info){
            String[] arr = s.split(":");
            String[] arr1 = arr[2].split(",");
            ArrayList<String> index1 = new ArrayList<>();
            index1.add(arr[0]);
            ArrayList<String> index2 = new ArrayList<>();
            index2.add(arr[1]);
            ArrayList<String> index3 = new ArrayList<>(Arrays.asList(arr1));
            total.add(index1);
            total.add(index2);
            total.add(index3);
        }

        for(int i = 2; i < total.size(); i+=3){
            ArrayList<String> temp1 = total.get(i);
            for(String s : temp1){
                for(int j = 2; j<total.size() && j!=i; j+=3){
                    ArrayList<String> temp2 = total.get(j);
                    boolean m = total.get(i-1).equals(total.get(j-1));
                    if(temp2.contains(s) && m)
                    {
                        conflicts.add(total.get(j-1).get(0));
                    }

                }

            }
        }

        String[] con = conflicts.toArray(new String[0]);
        return con;
    }
}