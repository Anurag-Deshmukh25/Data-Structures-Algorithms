package LinkedList;

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode(){}
//    ListNode(int x) { val = x; }
//    ListNode(int x, ListNode next) { val = x; next = next; }
//}

public class MergeSortedLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp1 = l1, temp2 = l2;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                curr.next = temp1;
                temp1 = temp1.next;
            }else{
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        curr.next = temp1 != null ? temp1 : temp2;

        return dummy.next;
    }
}
