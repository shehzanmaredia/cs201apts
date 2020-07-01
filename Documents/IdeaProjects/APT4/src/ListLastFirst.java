public class ListLastFirst {
    public ListNode move(ListNode list) {
            if (list == null || list.next == null) {
            return list;
            }
            ListNode first = list;

         ListNode trail = list;
        list = list.next;
                while (list.next != null) {
            trail = list;
            list = list.next;
        }
        trail.next = null;
        list.next = first;
        return list;
    }
}