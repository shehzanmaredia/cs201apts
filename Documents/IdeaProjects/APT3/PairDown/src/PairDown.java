import java.util.ArrayList;
public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++) {
            test.add(list[i]);
        }
        if(test.size()%2 != 0){
            test.add(0);
        }
        int ctr1 = 0;
        int ctr2 = 1;
        int[] ret = new int[test.size()/2];
        for(int i = 0; i < ret.length; i++){
            ret[i] = test.get(ctr1) + test.get(ctr2);
            ctr1 += 2;
            ctr2 += 2;
        }
        return ret;
    }
}