public class ListSum {
    public int sum(ListNode list, int thresh) {
        // replace statement below with code you write
        int sumList = 0;
        while (list != null) {
            if(list.info > thresh){
                sumList += list.info;
            }
            list = list.next;
        }
        return sumList;
    }
}