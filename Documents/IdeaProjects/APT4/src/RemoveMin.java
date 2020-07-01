public class RemoveMin {
    public ListNode remove (ListNode list) {
        // replace statement below with code you write
        ListNode min = new ListNode(10000);
        ListNode temp = list;
        ListNode node = null;
        if(list.next == null){
            return null;
        }
        if(list.info < min.info){
            min = list;
        }
        while(temp != null){
            if(temp.next != null && temp.next.info < min.info){
                min = temp.next;
                node = temp;
            }
            temp = temp.next;
        }

        if(min != list){
            node.next = min.next;
        }else{
            list = list.next;
        }
        return list;
    }
}