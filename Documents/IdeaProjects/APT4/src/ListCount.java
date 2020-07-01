public class ListCount {
    public int count (ListNode list) {
        // replace statement below with code you write
        int counter = 0;
        while(list!=null){
            counter++;
            list = list.next;
        }
        return counter;
    }
}