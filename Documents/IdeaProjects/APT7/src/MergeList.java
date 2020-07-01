public class MergeList {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode firstA = a;
        ListNode secondA = a;
        ListNode firstB = b;
        ListNode secondB = a;
        int counter = 0;
        if(a==null){
            return null;
        }
        while(secondA.next!=null){
            if(counter%2==0)
            {
                firstA.next = secondB;
                firstA=firstA;
                secondA=secondA.next;
            }
            if(counter%2==1)
            {
                firstB.next = secondA;
                firstB=firstB.next;
                secondB=secondB.next;
            }
            counter++;
        }
        return a;
    }
}
