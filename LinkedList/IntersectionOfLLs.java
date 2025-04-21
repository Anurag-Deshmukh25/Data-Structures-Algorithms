package LinkedList;

//public class ListNode {
//    int val;
//    ListNode next;
//    ListNode(){}
//    ListNode(int x) { val = x; }
//    ListNode(int x, ListNode next) { val = x; next = next; }
//}

public class IntersectionOfLLs {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }
}
