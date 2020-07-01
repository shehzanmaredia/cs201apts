public class ListShift {
    public ListNode shift(ListNode start, int key) {
        // write code here
        ListNode beg = null;
        ListNode end = beg;
      /*  if(start.info>=key)
        {
            beg = new ListNode(start.info, null);
            end = beg;
            start = start.next;
        }*/
        ListNode beg1 = null;
        ListNode endstart = beg1;
        while(start!=null)
        {
            if(start.info>key)
            {
                if(beg==null)
                {
                    beg = new ListNode(start.info, null);
                    end = beg;
                }
                else
                {
                    end.next = new ListNode(start.info, null);
                    end = end.next;
                }
            }
            else
            {


                if(beg1==null)
                {
                    beg1 = new ListNode(start.info, null);
                    endstart = beg1;
                }
                else
                {
                    endstart.next = new ListNode(start.info, null);
                    endstart = endstart.next;
                }
            }
            start = start.next;
        }
        if(end==null)
        {
            return beg1;
        }
        end.next = beg1;
        return beg;
    }
}