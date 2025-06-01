package linkedlist;

public class MergeSorted {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list2;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeSorted merger = new MergeSorted();
        ListNode mergedList = merger.mergeTwoLists(list1, list2);

        // Print merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
