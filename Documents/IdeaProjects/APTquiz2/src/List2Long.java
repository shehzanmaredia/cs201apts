public class List2Long {
    public long convert(ListNode list) {
        // write code here
        if(list.next == null)
        {
            return (long)list.info;
        }
        long val = 0;
        while(list!=null)
      {
          val = val*10+(long)list.info;
          list = list.next;
        }
        return val;
    }
}