/*public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        // fill in code here
        int index1 = -1;
        for (String s : orders)
        {
            String snew = s;
            int index = same(snew, available);
            if (index != -1)
            {
                index1 =
                return index1;
            }
            else
            {
                return i
            }
        }

        return index1;
    }

    public int same(String same, String [] available)
    {
        int ingindex = -1;
        String[] array1 = same.split( " ");
        for (int x = 0; x<array1.length; x++)
        {
            String s3=available[x];
            if (s3.equals(available[x]))
            {
                ingindex = 1;
            }
        }
        return ingindex;
    }
}
*/

import java.util.Arrays;
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        for (int k = 0; k < orders.length; k++) {
            String sandwich = orders[k];
            if (canMake(available, sandwich)) {
                return k;

            }
        }
        return -1;
    }

    private boolean canMake(String[] available, String sandwich) {
        String[] all = sandwich.split(" ");
        for (String one : all) {
            if(!Arrays.asList(available).contains(one))
            {
                return false;
            }
        }
        return true;
    }


}