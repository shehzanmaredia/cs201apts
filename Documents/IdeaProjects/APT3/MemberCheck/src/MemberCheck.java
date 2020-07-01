import java.util.ArrayList;
import java.util.TreeSet;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3)
    {
        // TODO: fill in code here
        //make arraylist
        //make club1, club2, and club3 into treesets
        ArrayList<String> peoples = new ArrayList<>();
        for(String a: club1){
            for(String b: club2){
                for(String c: club3){
                    if(c.equals(a)||c.equals(b)){
                        peoples.add(c);
                    }
                }
                if(b.equals(a)){
                    peoples.add(b);}
            }
        }
        TreeSet<String> set1 = new TreeSet<>(peoples);
        return set1.toArray(new String[0]);
    }
}
