public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // replace statement below with code you write
        int ctr1 = 0;
        int ctr2 = 0;
        while(a1 != null){
            ctr1 += 1;
            a1 = a1.next;
        }
        while(a2 != null){
            ctr2 += 1;
            a2 = a2.next;
        }
        if(ctr1 != ctr2){
            return 0;
        }
        boolean match = true;
        while(a1 != null){
            if(a1.info != a2.info){
                match = false;
            }
            a1 = a1.next;
            a2 = a2.next;
        }
        if(match){
            return 1;
        } else{
            return 0;
        }
    }
}