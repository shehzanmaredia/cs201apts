public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        // replace statement below with code you write
        ListNode first = list;
        while(list != null){
            for(int i = 0; i < amount - 1; i++){
                list.next = new ListNode(list.info, list.next);
                list = list.next;
            }
            list = list.next;
        }
        return first;
    }
}