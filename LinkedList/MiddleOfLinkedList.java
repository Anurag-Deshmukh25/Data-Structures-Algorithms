package LinkedList;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head){
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList finder = new MiddleOfLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = finder.middleNode(head);
        System.out.println("Middle Node Value: " + middle.val); // Output: 3
    }
}
