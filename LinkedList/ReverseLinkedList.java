package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList reverser = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = reverser.reverseList(head);

        // Print the reversed list
        ListNode current = reversedHead;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
