public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode firstA = a;
        ListNode secondA = a.next;
        ListNode firstB = b;
        ListNode secondB = b.next;
        int counter = 0;
        if(a==null){
            return null;
        }
        while(secondB!=null){
            if(counter%2==0)
            {
                firstA.next = firstB;
                firstA=secondA;
                secondA=secondA.next;
            }
            if(counter%2==1)
            {
                firstB.next = firstA;
                firstB=secondB;
                secondB=secondB.next;
            }
            counter++;
        }
        firstA.next = firstB;
        return a;
    }
}
