import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedList {
    public ListNode create(String[] words) {
        // write code here

        //convert array to arraylist words1
        //convert arraylist to sorted list

        //create linkedlist with first node being the index of the first node in sortedlist in words1
        //go through the sortedlist and each time add index

        ArrayList<String> words1 = new ArrayList<String>(Arrays.asList(words));
        ArrayList<String> words2 = new ArrayList<String>(Arrays.asList(words));
        Collections.sort(words2);
        int val = words1.indexOf(words2.get(0));
        ListNode fin = new ListNode(val, null);
        ListNode temp = fin;

        for (int i = 1; i<words.length; i++)
        {
            int val1 = words1.indexOf(words2.get(i));
            temp.next = new ListNode(val1, null);
            temp = temp.next;

        }
        return fin;
    }
}